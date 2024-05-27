package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public String getUserFirstName(@RequestParam String phoneNumber, @AuthenticationPrincipal UserDetails userDetails) {
        // Check if the authenticated user has the same phone number
        User user = userRepository.findByPhoneNumber(phoneNumber);
        if (user != null && user.getPhoneNumber().equals(userDetails.getUsername())) {
            return user.getFirstName();
        } else {
            throw new RuntimeException("User not found or not authorized");
        }
    }
}
