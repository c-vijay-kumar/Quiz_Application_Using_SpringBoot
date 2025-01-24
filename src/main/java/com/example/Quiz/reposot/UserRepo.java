package com.example.Quiz.reposot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Quiz.Model.User_model;

public interface UserRepo extends JpaRepository<User_model, Long>{

}

