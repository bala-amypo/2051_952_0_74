package com.example.demo.service;
import java.util.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
public interface StudentService{
     Student poststudent(Student st);
     List<Student> getAllStudents();
     Optional<Student> getById(Long id);
     String updateData(Long id,Student st);
     String deleteData(Long id);
     List<Student> getby(String name);
     List<Student> getbyc(float cgpa);
}