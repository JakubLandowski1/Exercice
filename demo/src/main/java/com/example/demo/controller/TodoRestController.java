package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TodoRestController {

    @GetMapping(value = "/todo")
    public String todo() {
        return "Course";
    }

    @GetMapping(value = "/todos")
    public List<String> todos(){
        return List.of("Course", "Sport", "Ménage");
    }



}
