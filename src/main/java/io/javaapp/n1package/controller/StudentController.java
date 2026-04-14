package io.javaapp.n1package.controller;

import io.javaapp.n1package.dto.StudentDto;
import io.javaapp.n1package.entity.Student;
import io.javaapp.n1package.service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();

    public void saveStudent() {
        StudentDto studentDto = new StudentDto("Damilola", "hello1", 18);
        Student student = studentService.registerStudent(studentDto);
        System.out.println("Student added successfully " + student);
    }

    public void findStudentById(int id) {
        Student student = studentService.findStudentById(id);
        System.out.println("Student found" + student);
    }
}
