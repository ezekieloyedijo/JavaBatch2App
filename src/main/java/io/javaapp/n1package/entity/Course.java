package io.javaapp.n1package.entity;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Course {
    private String id;
    private String name;
    private Set<Student> students;
    private List<Teacher> teachers;

    public Course(String name) {
        this.id = generateId();
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public Set<Student> viewStudents() {
        return students;
    }

    private static String generateId() {
        return UUID.randomUUID().toString();
    }



}
