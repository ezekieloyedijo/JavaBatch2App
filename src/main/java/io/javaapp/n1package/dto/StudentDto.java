package io.javaapp.n1package.dto;

import jdbc.enums.Gender;

public class StudentDto {
    private String name;
    private String password;
    private Integer age;

    public StudentDto(String name, String password, Integer age) {
        this.name = name;
        this.password = password;
        this.age = age;
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

    public Gender getGender() {
        return null;
    }
}
