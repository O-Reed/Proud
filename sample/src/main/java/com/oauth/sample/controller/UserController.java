
package com.oauth.sample.controller;

import com.oauth.sample.model.User;
import com.oauth.sample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService service;

//    @PostMapping("/register")
//    public User register(@RequestBody User user) {
//        System.out.println(user);
//        return service.register(user);
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody User user){
//        return service.verify(user);
//    }

}