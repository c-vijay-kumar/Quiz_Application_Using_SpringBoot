package com.example.Quiz.reposot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Quiz.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Long>{

}
