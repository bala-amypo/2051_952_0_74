package com.example.demo.controller;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }
    @GetMapping("/getall")
    public List<Student> get(){
     return stdser.getAllStudents();
    }
    @GetMapping("/getById/{id}")
    public Optional<Student> getId(@PathVariable Long id){
       return stdser.getById(id);
    }
    @PutMapping("/Update/{id}")
    public String update(@PathVariable Long id, @RequestBody Student st){
        return stdser.updateData(id,st);
    }
    @DeleteMapping("/DeleteBy/{id}")
    public String delete(@PathVariable Long id){
        return stdser.deleteData(id);
    }
    @GetMapping("{name}")
    public List<Student> getByAll(@PathVariable String name){
        return stdser.getby(name);
    }
    @GetMapping("{cgpa}")
    public List<Student> getBycgpa(@PathVariable float cgpa){
        return stdser.getbyc(cgpa);
    }
}