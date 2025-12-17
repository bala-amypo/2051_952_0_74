package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpRepository;
import com.example.demo.entity.Student;
@Rpositor
public interface StudentRepository extends JpRepository<Student,Long>{

}