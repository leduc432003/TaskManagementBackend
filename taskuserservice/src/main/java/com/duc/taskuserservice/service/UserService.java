package com.duc.taskuserservice.service;

import com.duc.taskuserservice.model.User;

import java.util.List;

public interface UserService {
    public User getUserProfile(String jwt);
    public List<User> getAllUsers();
}
