package com.outlook.philiphyw.todomanager.controller;

import com.outlook.philiphyw.todomanager.model.User;
import com.outlook.philiphyw.todomanager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repository;

    @GetMapping("users")
    public List<User> getAllUsers(){
        return repository.findAll().stream().toList();
    }

    @GetMapping("users/{id}")
    public User getUserById(@PathVariable long id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }
}
