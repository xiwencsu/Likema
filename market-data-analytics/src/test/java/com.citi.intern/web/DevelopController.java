package com.citi.intern.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/develop")
public class DevelopController {

    @GetMapping("/health")
    public String health() {
        return "good";
    }
}
