package com.docker.jenkins.k8s.integration.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @GetMapping
    public String getMessage(){
        return "Custom Message is return";
    }
}
