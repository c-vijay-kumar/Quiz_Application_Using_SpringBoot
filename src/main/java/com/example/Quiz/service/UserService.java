package com.example.Quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Quiz.Model.User_model;
import com.example.Quiz.reposot.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo repoU;

    // public UserService(UserRepo repoU){
        // this.repoU=repoU;
    // }
    public User_model CreateUser(User_model user){
        return repoU.save(user);
    }
    public List<User_model> getAllUsers(){
                return repoU.findAll();
    }
    public Optional<User_model> getByuserId(Long id){
        return repoU.findById(id);
    }
    public void deleteUser(Long id){
        repoU.deleteById(id);
    }

}
