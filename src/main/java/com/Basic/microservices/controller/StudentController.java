package com.Basic.microservices.controller;

import com.Basic.microservices.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        Student student= new Student(1, "Akshata","Darkonde");
        return student;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Radhika","Adhav"));
        students.add(new Student(2,"Sham","Rathod"));
        students.add(new Student(3,"Ram","Patil"));
        return students;
    }
}
