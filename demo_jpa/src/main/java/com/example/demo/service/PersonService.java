package com.example.demo.service;

import com.example.demo.entity.Person;
import org.apache.catalina.User;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findById(int id);

    void save(Person person);

    Person update(int id, Person person);

    Person getPersonById(int id);
}
