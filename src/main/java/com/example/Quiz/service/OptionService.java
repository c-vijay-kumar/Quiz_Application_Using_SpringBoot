package com.example.Quiz.service;
import com.example.Quiz.Model.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Quiz.reposot.OptionRepo;

@Service
public class OptionService {
    @Autowired
    OptionRepo repoOption;
    // public OptionService(OptionRepo repoOption){
        // this.repoOption=repoOption;
    // }
    public Option createOption(Option opt){
        return repoOption.save(opt);
    }
    public List<Option> getAllOptions(){
        return repoOption.findAll();
    }
    public Optional<Option> getOptionById(long id){
            return repoOption.findById(id);  
    }
    public void deleteOption(long id){
        repoOption.deleteById(id);
    }
    // public Option findById(Object optionId) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'findById'");
    // }
}
