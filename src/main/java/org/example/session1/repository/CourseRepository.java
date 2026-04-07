package org.example.session1.repository;


import org.example.session1.entity.Course;

import java.util.*;

public class CourseRepository {

    private List<Course> courses = new ArrayList<>();

    public void save(Course course) {
        courses.add(course);
    }

    public List<Course> getAll() {
        return courses;
    }
}
