package io.javaapp.n1package;

import io.javaapp.n1package.controller.StudentController;

public class App {
    public static void main(String[] args) {
      StudentController studentController = new StudentController();
      studentController.saveStudent();


    }
}
