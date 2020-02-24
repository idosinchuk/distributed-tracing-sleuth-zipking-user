package com.idosinchuk.distributedtracing.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.idosinchuk.distributedtracing.user.dto.User;
import com.idosinchuk.distributedtracing.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable Integer userId) {
    
		log.info("Hello from User Service with userId: {}", userId);
    	return userService.getUser(userId);
    }
    
    @PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@RequestBody User user) {
    
		log.info("Hello from User Service");
    	User response = userService.addUser(user);
		
    	return new ResponseEntity<>(response, HttpStatus.OK);
    }
}