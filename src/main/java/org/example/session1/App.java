package org.example.session1;


import org.example.session1.entity.*;
import org.example.session1.repository.*;
import org.example.session1.service.SchoolService;

public class App {
    public static void main(String[] args) {

        StudentRepository studentRepo = new StudentRepository();
        CourseRepository courseRepo = new CourseRepository();

        Student s1 = new Student(1, "Ezekiel");
        Student s2 = new Student(2, "Paul");

        studentRepo.save(s1);
        studentRepo.save(s2);

        Course javaCourse = new Course("Java");
        courseRepo.save(javaCourse);

        Teacher t1 = new Teacher(1, "Mr A");

        SchoolService service = new SchoolService(studentRepo.getAll(), courseRepo.getAll());

        service.registerStudentToCourse(1, javaCourse);
        service.assignTeacherToCourse(t1, javaCourse);

        System.out.println(javaCourse.getStudents());
    }
}
