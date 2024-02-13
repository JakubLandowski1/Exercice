package com.example.tp_spring.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private UUID id;
    private String lastname;
    private String firstname;
    private String email;
    private int age;
}
