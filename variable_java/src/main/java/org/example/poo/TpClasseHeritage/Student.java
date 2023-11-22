package org.example.poo.TpClasseHeritage;

public class Student extends Person {
    public Student(int age) {
        super(age);
    }

    public void goToClasses( ) {
        System.out.println("I'm going to class");
    }

    public void displayAge() {

        System.out.printf("My age is: %d years old \n", age);
    }


}
