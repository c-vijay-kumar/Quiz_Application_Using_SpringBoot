package com.example.Quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Quiz.Model.Question;
import com.example.Quiz.reposot.QuestionRepo;

@Service
public class QuestionService {
    @Autowired
    QuestionRepo repoQuestion;

    // public QuestionService(QuestionRepo repoQuestion){
        // this.repoQuestion=repoQuestion;
    // }

    public Question CreateQuestion(Question que){
        return repoQuestion.save(que);
    }
    public List<Question> getallQuestions(){
        return repoQuestion.findAll();
    }
    public Optional<Question> getQuestionbyId(long id){
        return repoQuestion.findById(id);
    }
    public void deleteQuestion(long id){
        repoQuestion.deleteById(id);
    }

}
