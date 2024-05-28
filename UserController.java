package com.spring.mysql.blogproject;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping(path = "/register")
    public @ResponseBody User registerUser(@RequestParam String username, @RequestParam String password ){
        User su = new User();
        su.setUsername(username);
        su.setPassword(password);
        userRepository.save(su);
        return su;
    }

    @GetMapping(path = "/login")
    public @ResponseBody Boolean verifyUser(@RequestParam String username, @RequestParam String password){
        Iterable<User> users = userRepository.findAll();
        User user = null;
        for(User i : users){
            System.out.println(i.getUsername());
            if(i.getUsername().equals(username)){
                System.out.println(i.getUsername());
                user = i;
                break;
            }
        }
        //System.out.println(user.getUsername());
        if(user == null){
            return false;
        }
        if(user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}