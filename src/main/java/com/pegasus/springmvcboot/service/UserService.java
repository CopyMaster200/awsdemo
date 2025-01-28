package com.pegasus.springmvcboot.service;

import com.pegasus.springmvcboot.model.User;
import jakarta.mail.MessagingException;

import java.util.List;

public interface UserService {
    User saveUser(User user) throws MessagingException;

    List<User> fetchUsers();
}
