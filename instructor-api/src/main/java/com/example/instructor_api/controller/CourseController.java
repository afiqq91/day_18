package com.example.instructor_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @GetMapping
    public List<String> getCourses() {
        return List.of(
            "Java Fundamentals",
            "Spring Boot",
            "Docker"
        );
    }
}