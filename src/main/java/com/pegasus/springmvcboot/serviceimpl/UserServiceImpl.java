package com.pegasus.springmvcboot.serviceimpl;

import com.pegasus.springmvcboot.model.MessageDto;
import com.pegasus.springmvcboot.model.User;
import com.pegasus.springmvcboot.repository.UserRepository;
import com.pegasus.springmvcboot.service.EmailService;
import com.pegasus.springmvcboot.service.TwilioMessagingService;
import com.pegasus.springmvcboot.service.UserService;
import jakarta.mail.MessagingException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    private static final String MESSAGE = "User account created successfully!";
    @Autowired
    UserRepository userRepository;
    @Autowired
    TwilioMessagingService messagingService;
    @Autowired
    EmailService emailService;

    @Override
    public User saveUser(User user) throws MessagingException {
        user = userRepository.save(user);
        messagingService.sendSms(new MessageDto(user.getMobileNumber(), MESSAGE, user.getUserName()));
        emailService.sendSimpleMessage(user.getEmail(), "User created successfully!", "Your account created!!", null);
        return user;
    }

    @Override
    public List<User> fetchUsers() {
        return userRepository.findAll();
    }
}
