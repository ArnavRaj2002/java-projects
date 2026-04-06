package com.arnav.githubaccess.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;
@Service
public class GitHubApiClient {

    @Value("${github.token}")
    private String token;

    private final WebClient webClient = WebClient.create("https://api.github.com");

    @SuppressWarnings("unchecked")
	public List<Map<String, Object>> getRepos(String org) {
        return webClient.get()
                .uri("/orgs/{org}/repos", org)
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .bodyToMono(List.class)
                .block();
    }
    @SuppressWarnings("unchecked")
	public List<Map<String, Object>> getCollaborators(String org, String repo) {
        return webClient.get()
                .uri("/repos/{org}/{repo}/contributors", org, repo)
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .bodyToMono(List.class)
                .block();
    }
}