package com.idosinchuk.distributedtracing.user.service;

import com.idosinchuk.distributedtracing.user.dto.User;

public interface UserService {

    User getUser(Integer userId);
    
    User addUser(User user);
}