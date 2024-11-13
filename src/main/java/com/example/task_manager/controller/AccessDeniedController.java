package com.example.task_manager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccessDeniedController {

    @GetMapping("/access-denied")
    public ResponseEntity<String> accessDenied() {
        return ResponseEntity.status(403).body("You do not have permission to access this resource.");
    }
}
