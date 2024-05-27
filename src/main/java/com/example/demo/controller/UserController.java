package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUserByPhoneNumber(@RequestParam String phoneNumber, Authentication authentication) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return "Authenticated user: " + userDetails.getUsername() + ", phone number: " + phoneNumber;
    }
}