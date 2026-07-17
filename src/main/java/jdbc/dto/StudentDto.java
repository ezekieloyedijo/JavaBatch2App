package jdbc.dto;

import jdbc.enums.Gender;

public class StudentDto {
    private String password;
    private String name;
    private Gender gender;
    private int age;


    public StudentDto(String password, String name, int age, Gender gender) {
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
