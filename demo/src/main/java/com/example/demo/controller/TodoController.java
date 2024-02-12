package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {

    @RequestMapping(value= "/home")
    public String Todos(){
        return "home";
    }

    @RequestMapping ("/home/todos")
    public String todos(Model model) {
        model.addAttribute("title", List.of("Course", "Ménage"));

        return "todos/todosList";

    }



}
