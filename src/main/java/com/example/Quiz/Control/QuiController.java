package com.example.Quiz.Control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Quiz.Model.Qui;
import com.example.Quiz.service.QuiService;
@RestController
@RequestMapping("/api/quizzes")
public class QuiController {
    @Autowired
    QuiService servQuiz;
    @PostMapping
    public ResponseEntity<Qui> createQuiz(Qui quiz){
        return ResponseEntity.ok(servQuiz.createQuiz(quiz));
    }
    @GetMapping
    public ResponseEntity<List<Qui>> GetallQuizes(){
            return ResponseEntity.ok(servQuiz.GetallQuizes());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Qui>> GetquizById(@PathVariable Long id){
        return ResponseEntity.ok(servQuiz.GetquizById(id));
    }
    @DeleteMapping("/{id}")
    public void deleteQuiz(@PathVariable Long id){
        servQuiz.deleteQuiz(id);
    }


}
