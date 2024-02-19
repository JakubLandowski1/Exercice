package com.example.demo.controller;


import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonRestController {

    private PersonService personService;

    @GetMapping("/list")
    public List<Person> getAllPersons(){
        return personService.findAll();
    }

    @GetMapping("/addoneperson")
    public void addOnePerson(){
        personService.save(Person.builder()
                .firstName("toto")
                .lastName("tata")
                .email("toto@tata.com")
                .build());
    }


    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return personService.get(id);
    }

    @PutMapping("/update/{id}")
    public User updateOnePersonn(@PathVariable int id, @RequestBody Person person) {
        return personService.update(id, person);

    }





}
