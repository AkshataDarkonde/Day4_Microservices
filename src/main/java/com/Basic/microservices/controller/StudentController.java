package com.Basic.microservices.controller;

import com.Basic.microservices.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("students/create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("students/{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("students/{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return ResponseEntity.ok("Student deleted successfully!");
    }
}
