package org.amazon.example.controller;

import org.amazon.example.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/api/welcome")
    public String getWelcomeMessage() {
        return welcomeService.getWelcomeMessage();
    }
}