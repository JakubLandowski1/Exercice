package org.example;

import component.FormComponent;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        FormComponent form = new FormComponent();
        form.initialize();
    }
}