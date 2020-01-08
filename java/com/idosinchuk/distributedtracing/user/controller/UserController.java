package com.idosinchuk.distributedtracing.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.idosinchuk.distributedtracing.user.dto.User;
import com.idosinchuk.distributedtracing.user.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable Integer userId) {
        return userService.getUser(userId);
    }
}