package com.jobiak.mongodbspring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jobiak.mongodbspring.repository.IssueRepository;

public class IssueController {

	private IssueRepository repository;

    public IssueController(IssueRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/issues")
    public String getAllIssues(Model model) {
        model.addAttribute("issues", repository.findAll());
        return "list-issues";
    }
}
