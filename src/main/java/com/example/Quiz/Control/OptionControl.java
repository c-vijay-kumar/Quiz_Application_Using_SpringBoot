package com.example.Quiz.Control;

// import java.lang.classfile.ClassFile.Option;
import com.example.Quiz.Model.Option; // Correct import

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

import com.example.Quiz.service.OptionService;

@RestController
@RequestMapping("/api/options")
public class OptionControl {
    @Autowired
    OptionService serveOption;
    @PostMapping
    public ResponseEntity<Option> createOption(@RequestBody Option opt){
        return ResponseEntity.ok(serveOption.createOption(opt));
    }
    @GetMapping
    public ResponseEntity<List<Option>> getAllOptions(){
        return ResponseEntity.ok(serveOption.getAllOptions());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Option>> getOptionById(@PathVariable long id){
        return ResponseEntity.ok(serveOption.getOptionById(id));
    } 
    @DeleteMapping("/{id}")
    public void deleteOption(@PathVariable long id){
        serveOption.deleteOption(id);
    }
}
