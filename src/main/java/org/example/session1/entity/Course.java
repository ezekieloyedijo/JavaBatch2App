package org.example.session1.entity;

import java.util.*;

public class Course {
    private String name;
    private Set<Student> students = new HashSet<>();
    private List<Teacher> teachers = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public Set<Student> getStudents() {
        return students;
    }
}
