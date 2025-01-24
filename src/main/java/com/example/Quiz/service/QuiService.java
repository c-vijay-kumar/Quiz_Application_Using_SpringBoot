package com.example.Quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Quiz.Model.Qui;
import com.example.Quiz.reposot.QuiRepo;

@Service
public class QuiService {
    @Autowired
    QuiRepo repoQui;
    // public QuiService(QuiRepo repoQui){
        // this.repoQui=repoQui;
    // }
    public Qui createQuiz(Qui quiz){
        return repoQui.save(quiz);
    }
    public List<Qui> GetallQuizes(){
        return repoQui.findAll();
    }
    public Optional<Qui> GetquizById(Long id){
        return repoQui.findById(id);
    }
    public void deleteQuiz(Long id){
        repoQui.deleteById(id);
    }

}
