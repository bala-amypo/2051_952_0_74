package com.example.demo.service;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
public interface StudentService{
     Student poststudent(Student st);
     List<Student> getAllStudents();
     
}