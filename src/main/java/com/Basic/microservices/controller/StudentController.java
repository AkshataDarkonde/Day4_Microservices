package com.Basic.microservices.controller;

import com.Basic.microservices.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        Student student= new Student(1, "Akshata","Darkonde");
        return student;
    }
}
