package com.example.Quiz.Model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType; // Import added
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany; // Import added
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "QUI")

public class Qui {
    @Id
    private long id;
    private String title;
    private String category;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL) // Annotation added
    private List<Question> questions;
}
