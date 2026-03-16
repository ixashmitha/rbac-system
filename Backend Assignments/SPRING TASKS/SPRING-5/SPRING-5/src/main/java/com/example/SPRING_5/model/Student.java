package com.example.SPRING_5.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//generates getters,setters,etc
@NoArgsConstructor//empty constructor generation
@AllArgsConstructor//constructor with all fields
@Entity //tells hibernate this class maps to db
@Table(name ="students")
public class Student {
    @Id//primary key field
    @GeneratedValue(strategy = GenerationType.IDENTITY)//tells db to auto-increment id
    private Long id;
    @Column(name="name",nullable=false)
    private String name;
    @Column(name="email",unique = true)
    private String email;
    @Column(name="age")
    private int age;
}
