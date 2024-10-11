package com.mojo.experience.controller;

import com.mojo.experience.mapper.UserMapper;
import com.mojo.experience.pojo.User;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private UserMapper userMapper;
    public String query() {
        List<User> users = userMapper.findAll();
        return users.toString();
    }
}
