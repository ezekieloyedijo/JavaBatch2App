package org.example.session1.repository;


import org.example.session1.entity.Student;

import java.util.*;

public class StudentRepository {

    private Map<Integer, Student> studentMap = new HashMap<>();

    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

    public Student findById(int id) {
        return studentMap.get(id);
    }

    public Map<Integer, Student> getAll() {
        return studentMap;
    }
}
