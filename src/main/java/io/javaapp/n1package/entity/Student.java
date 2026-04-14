package io.javaapp.n1package.entity;

import io.javaapp.n1package.dto.StudentDto;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String password;
    private Integer age;

    public Student( String name, String password, Integer age) {
        this.id = generateId();
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public Student (StudentDto studentDto) {
        this.id = generateId();
        this.name = studentDto.getName();
        this.password = studentDto.getPassword();
        this.age = studentDto.getAge();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private static int generateId() {
        return (int) (Math.random() * 1000000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(password, student.password) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
