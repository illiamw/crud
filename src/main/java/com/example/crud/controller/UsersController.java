package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.User;
import com.example.repository.UserRepository;

@RestController
@RequestMapping("api/users")
public class UsersController {


   
    private UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping
    public List<User> list(){
        return null;
    }


    
}
