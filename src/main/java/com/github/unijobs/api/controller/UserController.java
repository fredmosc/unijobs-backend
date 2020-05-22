package com.github.unijobs.api.controller;

import com.github.unijobs.api.model.User;
import com.github.unijobs.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private  final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> list(){
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findOne(id));
    }

}
