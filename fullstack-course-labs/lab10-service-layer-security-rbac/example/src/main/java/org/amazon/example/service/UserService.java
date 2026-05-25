package org.amazon.example.service;

import java.util.HashMap;
import java.util.Map;

import org.amazon.example.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final Map<String, User> users = new HashMap<>();
    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;

        users.put("admin", new User(
                "admin",
                passwordEncoder.encode("admin123"),
                "ADMIN"));

        users.put("user", new User(
                "user",
                passwordEncoder.encode("user123"),
                "USER"));
    }

    public void registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        if (user.getRole() == null || user.getRole().isBlank()) {
            user.setRole("USER");
        }

        users.put(user.getUsername(), user);
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}