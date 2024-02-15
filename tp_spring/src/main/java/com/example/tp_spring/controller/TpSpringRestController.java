package com.example.tp_spring.controller;

import com.example.tp_spring.model.Student;
import com.example.tp_spring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tp")
public class TpSpringRestController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable UUID studentId) {
        return studentService.getStudentById(studentId);

    }
}
