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

import com.example.Quiz.Model.Question;
import com.example.Quiz.service.QuestionService;


@RestController
@RequestMapping("/api/questions")
public class QuestionControl {
    @Autowired
    QuestionService servQuestion;
    @PostMapping
    public ResponseEntity<Question> CreateQuestion(Question que){
        return ResponseEntity.ok(servQuestion.CreateQuestion(que));
    }
    @GetMapping
    public ResponseEntity<List<Question>> getallQuestions(){
        return ResponseEntity.ok(servQuestion.getallQuestions());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Question>> getQuestionbyId(@PathVariable long id){
        return ResponseEntity.ok(servQuestion.getQuestionbyId(id));
    }
    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable long id){
        servQuestion.deleteQuestion(id);
    }


}
