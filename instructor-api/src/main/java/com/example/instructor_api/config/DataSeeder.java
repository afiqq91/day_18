package com.example.instructor_api.config;

import com.example.instructor_api.model.Role;
import com.example.instructor_api.model.User;
import com.example.instructor_api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) {

        String adminEmail = "admin@admin.com";

        if (userRepository.findByEmail(adminEmail).isPresent()) {

            System.out.println("Admin user already exists.");

            return;
        }

        User admin = new User();

        admin.setName("Admin");

        admin.setEmail(adminEmail);

        admin.setPassword("encoded_pwd12345");

        admin.setRole(Role.ADMIN);

        userRepository.save(admin);

        System.out.println("Admin user created.");
    }
}