package com.example.tp_blog.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nom")
    private String nom;
    @Column(name ="email")
    private String email;
    @Column(name = "contentPost")
    private String contentPost;

    public Post() {
    }

    public Post(UUID id, String nom, String email, String contentPost) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.contentPost = contentPost;
    }

    public UUID getId() {
        return id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public String getContentPost() {
        return contentPost;
    }

    public void setContentPost(String contentPost) {
        this.contentPost = contentPost;
    }



}
