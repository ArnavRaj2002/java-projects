package com.arnav.githubaccess.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnav.githubaccess.client.GitHubApiClient;
@Service
public class GithubService {
	@Autowired
 public   GitHubApiClient gitClient;
	public Map<String, List<String>> getAccessReport(String org) {

	    Map<String, List<String>> userRepoMap = new HashMap<>();

	    List<Map<String, Object>> repos = gitClient.getRepos(org);

	    if (repos == null || repos.isEmpty()) {
	        throw new RuntimeException("No repositories found for org: " + org);
	    }

	    for (Map<String, Object> repo : repos) {

	        String repoName = (String) repo.get("name");

	        List<Map<String, Object>> users =
	                gitClient.getCollaborators(org, repoName);

	        if (users == null || users.isEmpty()) {
	            continue;
	        }

	        for (Map<String, Object> user : users) {
	            String login = (String) user.get("login");

	            userRepoMap
	                .computeIfAbsent(login, k -> new ArrayList<>())
	                .add(repoName);
	        }
	    }

	    return userRepoMap;
	}
}
