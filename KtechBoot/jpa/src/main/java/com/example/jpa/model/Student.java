package com.example.jpa.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    //@Column(name = "full_name", unique = true)
    private String name;
    private Integer age;
    private Integer grade;
    private String email;
    private String phone;

    @ManyToOne
   // @JoinColumn
    private Instructor advisor;
}
