package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/user/getFirstName/{phoneNumber}")
    public String getUserFirstName(@PathVariable String phoneNumber) {
        // Check if the authenticated user has the same phone number
        User user = userRepository.findByPhoneNumber(phoneNumber);
        if (user != null) {
            return user.getFirstName();
        } else {
            // throw new RuntimeException("User not found");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, phoneNumber + " not available");
        }

    }

}
