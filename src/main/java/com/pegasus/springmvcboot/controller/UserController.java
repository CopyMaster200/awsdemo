package com.pegasus.springmvcboot.controller;

import com.pegasus.springmvcboot.model.User;
import com.pegasus.springmvcboot.service.UserService;
import jakarta.mail.MessagingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String SpringApplicationStartPage() {
        log.info("Home page");
        return "userIndex";
    }

    @PostMapping("addUser")
    public ModelAndView addUser(@ModelAttribute User user) throws MessagingException {
        ModelAndView modelView = new ModelAndView("userResult");
        modelView.addObject(userService.saveUser(user));
        return modelView;
    }

    @GetMapping("userList")
    public ModelAndView fetchUsers() {
        ModelAndView modelView = new ModelAndView("userList");
        List<User> users = userService.fetchUsers(); // fetch your user data here
        Map<String, Object> model = new HashMap<>();
        String message = "Here is the list of users";
        int totalUsers = users.size();  // Assuming you want to show the number of users

        // Populate the model map
        model.put("users", users);
        model.put("message", message);
        model.put("totalUsers", totalUsers);

        // Add all objects to ModelAndView
        modelView.addAllObjects(model);
        return modelView;
    }
}
