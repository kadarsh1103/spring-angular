package com.example.employeemanagerapp.logout;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogout {

    public void logout() {
        System.out.println("User Logged out");
    }
}
