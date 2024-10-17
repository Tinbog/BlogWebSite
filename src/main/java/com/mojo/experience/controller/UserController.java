package com.mojo.experience.controller;

import com.mojo.experience.mapper.UserMapper;
import com.mojo.experience.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;
    @GetMapping("/get")
    public String query() {
        List<User> users = userMapper.selectList(null);
        return users.toString();
    }
}
