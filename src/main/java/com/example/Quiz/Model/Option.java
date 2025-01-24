package com.example.Quiz.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Option")

public class Option {
    @Id
    private long id;
    private String text;

    @Column(name = "is_correct")
    private boolean isCorrect;
    @ManyToOne
    @JoinColumn(name ="question_id")
    private Question question;
}
