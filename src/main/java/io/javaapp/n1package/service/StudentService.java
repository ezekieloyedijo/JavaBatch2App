package io.javaapp.n1package.service;

import io.javaapp.n1package.dto.StudentDto;
import io.javaapp.n1package.entity.Student;
import io.javaapp.n1package.repository.StudentRepository;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();

    public Student registerStudent(StudentDto studentDto) {
        if(studentDto.getAge() < 18) {

        }
        else if(studentDto.getName().isEmpty()) {

        }
        Student student = new Student(studentDto);
        studentRepository.save(student);
        return student;
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }
}
