package com.example.demo.controller;

import com.example.demo.exception.InvalidInputException;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {

        if(id <= 0){
            throw new InvalidInputException("Student ID must be positive");
        }

        if(id != 1){
            throw new StudentNotFoundException("Student with ID " + id + " not found");
        }

        return new Student(1, "Hasini", "CSE");
    }
}