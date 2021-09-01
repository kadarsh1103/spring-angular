package com.example.employeemanagerapp.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogin {

    @GetMapping("/login")
    public String login() {
        return "user logged in";
    }

}
