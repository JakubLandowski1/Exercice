package com.example.tp_spring.controller;


import com.example.tp_spring.model.Student;
import com.example.tp_spring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor

public class TpSpringController {

    private final StudentService studentService;

    @GetMapping
    public String accueil() {
        return "accueil";
    }

    @GetMapping("detail/{studentId}")
    public String detailStudent(@PathVariable("studentId")UUID id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("nomStudent", student);
        return "detailStudent";
    }

    @GetMapping("/list")
    public String listingStudents(Model model) {
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "detailsEtudiant";
    }

    @GetMapping("/add")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "templates/inscription";
    }

    @GetMapping("/show")
    public String showStudent(@RequestParam(name = "namestudent", required = false) String name, Model model) {
        System.out.println(name);
        Student student = studentService.getStudentByName(name);

        if (student != null) {
            model.addAttribute("etudiant", student);
            return "detailsEtudiant";
        } else {
            return "detailsEtudiantsSiVide";
        }

    }
}
