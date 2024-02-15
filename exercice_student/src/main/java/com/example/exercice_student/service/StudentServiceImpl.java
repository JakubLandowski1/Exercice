package com.example.exercice_student.service;

import com.example.exercice_student.model.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentServiceImpl implements IStudentService{




    private List<Student> students = new ArrayList<>();

    private Long currentId = 1L;

    @Override
    public Student createStudent(Student student) {
        student.setId(currentId++);
        students.add(student);
        return student;
    }

    @Override
    public Student getStudentById(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public List<Student> searchStudents(String search) {
        return students.stream()
                .filter(student -> student.getFirstName().toLowerCase().contains(search.toLowerCase()) || student.getLastName().toLowerCase().contains(search.toLowerCase())).toList();
    }

    @Override
    public void deleteStudent(long id) {
        Student student = getStudentById(id);
        students.remove(student);
    }

    @Override
    public Student putStudent(Student student, long id) {
        Student putStudent = getStudentById(id);
        putStudent.setAge(student.getAge());
        putStudent.setFirstName(student.getFirstName());
        putStudent.setEmail(student.getEmail());
        putStudent.setLastName(student.getLastName());
        return putStudent;
    }


}
