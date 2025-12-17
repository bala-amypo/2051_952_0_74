package com.example.demo.entity;
import java.time.LocalDate;
import jakarta.persistence.*;
@Entity
public class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dept;
   
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public Student(Long id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        
    }
    public Student() {
    }
}
