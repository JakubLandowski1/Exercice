package org.example.poo.TpClasseHeritage;

public class Teacher extends Person {

    public Teacher(int age) {
        super(age);
    }
    private String subject;
    public void explain () {
        System.out.println("Explanation begins");
    }
}
