package com.example.Quiz.Control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Quiz.Model.User_model;
import com.example.Quiz.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService servUser;
    @PostMapping
    public ResponseEntity<User_model> CreateUser(@RequestBody User_model user){
            return  ResponseEntity.ok(servUser.CreateUser(user));
    }
    @GetMapping
    public ResponseEntity<List<User_model>> getAllUsers(){
        return ResponseEntity.ok(servUser.getAllUsers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User_model>> getByuserId (@PathVariable long id){
        return ResponseEntity.ok(servUser.getByuserId(id));
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
        servUser.deleteUser(id);
    }
}
