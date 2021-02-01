package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent () {
        return studentService.getAllStudents();
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(int id){
        return studentService.getStudentByID(id);
    }
    @PostMapping("/student")
    public void saveStudent(@RequestBody  Student student){
        studentService.saveOrUpdate(student);
    }
    @DeleteMapping("/student/{id}")
    public void delete(int id){
        studentService.delete(id);
    }
}
