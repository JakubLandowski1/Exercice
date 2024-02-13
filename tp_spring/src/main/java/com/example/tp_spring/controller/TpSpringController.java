package com.example.tp_spring.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class TpSpringController {

    @GetMapping(value = "/accueil")
    public String accueil() {
        return "accueil";
    }


}
