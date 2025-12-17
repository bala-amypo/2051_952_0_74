package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
impo
@RestController
public class StudentController{
  @PostMapping("/addStudent")
  public Student addStudent(@RequestBody Student st){
           
  }
}