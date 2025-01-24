package com.example.Quiz.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "USER_MODEL")
public class User_model {
    @Id
    private long id;
    private String user_name;
    private String password;
    private String role;
}
