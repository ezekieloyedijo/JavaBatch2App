package org.example.session1.service;


import org.example.session1.entity.Course;
import org.example.session1.entity.Student;
import org.example.session1.entity.Teacher;

import java.util.*;

public class SchoolService {

    private Map<Integer, Student> students;
    private List<Course> courses;

    public SchoolService(Map<Integer, Student> students, List<Course> courses) {
        this.students = students;
        this.courses = courses;
    }

    public void registerStudentToCourse(int studentId, Course course) {
        Student student = students.get(studentId);
        if (student != null) {
            course.addStudent(student);
        }
    }

    public void assignTeacherToCourse(Teacher teacher, Course course) {
        course.addTeacher(teacher);
    }
}
