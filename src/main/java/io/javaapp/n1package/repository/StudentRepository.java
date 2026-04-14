package io.javaapp.n1package.repository;

import io.javaapp.n1package.entity.Student;

import java.util.HashMap;
import java.util.Map;

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
