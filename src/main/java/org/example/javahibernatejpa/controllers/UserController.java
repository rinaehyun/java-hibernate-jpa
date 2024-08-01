package org.example.javahibernatejpa.controllers;

import lombok.RequiredArgsConstructor;
import org.example.javahibernatejpa.entities.User;
import org.example.javahibernatejpa.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}
