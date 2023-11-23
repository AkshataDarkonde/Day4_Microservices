package com.Basic.microservices.controller;

import com.Basic.microservices.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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


    @GetMapping("students/{id}/{firstname}/{lastname}")
    public Student studentPathVariable(@PathVariable("id")int studentId,
                                       @PathVariable("first-name")String firstNmae,
                                       @PathVariable("last-name")String lastName){
        return new Student(studentId,firstNmae,lastName);
    }

    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName){
        return new Student(id,firstName,lastName);
    }
}
