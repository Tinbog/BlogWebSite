package com.mojo.experience.controller;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.auth.Subject;

public class Login {
    public String readCookie(@CookieValue(value = "username",
            defaultValue = "Atta") String username) {
        return "Hey! My username is " + username;
    }
    @GetMapping("/signup")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().setAttribute("username", "Atta");
        return "/signup";
    }
}
