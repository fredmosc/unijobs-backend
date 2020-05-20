package com.github.unijobs.api.controller;

import com.github.unijobs.api.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
    @GetMapping
    public ResponseEntity<User> hello() {
        User user = new User();

        user.setId(1l);
        user.setName("Joao");
        user.setPassword("123456");

        return ResponseEntity.ok(user);
    }
}
