package com.outlook.philiphyw.todomanager.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("rosa");
        boolean isValidPassword = password.equals("123qwE");
        return isValidUsername && isValidPassword;
    }
}
