package com.example.exercice_student.controller;


import com.example.exercice_student.model.Student;
import com.example.exercice_student.service.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/academy")
@AllArgsConstructor
public class StudentRestController {

    private final IStudentService studentService;


    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        System.out.println(id);
        System.out.println(studentService.getStudentById(id));
        return studentService.getStudentById(id);
    }

    @PutMapping("/student/{id}")
    public Student  putStudent(@PathVariable long id, @RequestBody Student student) {
        return studentService.putStudent(student, id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
    }

    @PostMapping("/student")
    public void postStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }


}
