package com.springbootvue.api.user.controller;

import com.springbootvue.api.user.model.User;
import com.springbootvue.api.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by louchen on 2017/6/30.
 */
@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "")
    public List<User> getUserList() {
        return userRepository.findAll();
    }

}
