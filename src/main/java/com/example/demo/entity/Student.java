package com.example.demo.entity;
import java.time.LocalDate;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @NotBlank
    private String dept;
   
}
