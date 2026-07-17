package jdbc.entity;

import jdbc.dto.StudentDto;
import jdbc.enums.Gender;

import java.util.UUID;

public class Student {
    private String id;
    private String name;
    private int age;
    private Gender gender;
    private String password;

    public Student() {}

    public Student (StudentDto studentDto) {
        this.id = generateId();
        this.name = studentDto.getName();
        this.age = studentDto.getAge();
        this.gender = studentDto.getGender();
        this.password = studentDto.getPassword();
    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
