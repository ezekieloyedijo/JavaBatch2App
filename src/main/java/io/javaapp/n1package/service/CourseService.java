package io.javaapp.n1package.service;

import io.javaapp.n1package.entity.Course;
import io.javaapp.n1package.repository.CourseRepository;

public class CourseService {
    CourseRepository courseRepository = new CourseRepository();

    public Course addCourse(Course course) {
        if(course != null) return courseRepository.save(course);
        return null;
    }

}
