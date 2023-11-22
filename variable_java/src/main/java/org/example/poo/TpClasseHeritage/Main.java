package org.example.poo.TpClasseHeritage;



public class Main {

    public static void main(String[] args) {

        Student student = new Student(18);
        Teacher teacher = new Teacher(40);

        student.Hello();
        student.goToClasses();
        teacher.Hello();
        student.displayAge();
        teacher.Hello();
        teacher.explain();

    }

}
