package com.example.demo.service;
import java.util.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
public interface StudentService{
     Student poststudent(Student st);
     List<Student> getAllStudents();
     Student getById(Long id);
}