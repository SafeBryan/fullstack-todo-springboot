package org.amazon.example.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String getWelcomeMessage() {
        return "¡Bienvenido a la API REST de Spring Boot!";
    }
}