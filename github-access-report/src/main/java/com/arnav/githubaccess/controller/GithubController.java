package com.arnav.githubaccess.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.arnav.githubaccess.service.GithubService;

@RestController
@RequestMapping("/github")
public class GithubController {
	@Autowired
	public GithubService gitService;

	@GetMapping("/access-report")
	public Map<String, List<String>> getAccessReport(@RequestParam String org) {
		return gitService.getAccessReport(org);
	}
}
