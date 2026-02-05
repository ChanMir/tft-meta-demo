package com.example.demo.controller;

import java.time.Instant;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "message", "hello",
            "time", Instant.now().toString()
        );
    }
}
