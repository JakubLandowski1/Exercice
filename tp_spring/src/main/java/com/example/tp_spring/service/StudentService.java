package com.example.tp_spring.service;

import com.example.tp_spring.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class StudentService {
    private final Map<UUID, Student> students;


    public StudentService() {
        students = new HashMap<>();

        Student studentOne = Student.builder()
                .id(UUID.randomUUID())
                .firstname("Jean")
                .lastname("Dupont")
                .age(23)
                .email("jeanDupont@mail.com")
                .build();


        Student studentTwo = Student.builder()
                .id(UUID.randomUUID())
                .firstname("Pierre")
                .lastname("Dufour")
                .age(23)
                .email("PierreDufour@mail.com")
                .build();


        Student studentThree = Student.builder()
                .id(UUID.randomUUID())
                .firstname("Alice")
                .lastname("Dupont")
                .age(23)
                .email("AliceDpnt@mail.com")
                .build();

        students.put(studentOne.getId(), studentOne);
        students.put(studentTwo.getId(), studentTwo);
        students.put(studentThree.getId(), studentThree);
    }

    public List<Student> getStudents(){
        return students.values().stream().toList();
    }

    public Student getStudentByName (String name) {
        return students.values().stream().filter(r-> r.getLastname().equals(name)).findFirst().orElse(null);
    }

    public Student getStudentById(UUID id) {
        return students.values().stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

}
