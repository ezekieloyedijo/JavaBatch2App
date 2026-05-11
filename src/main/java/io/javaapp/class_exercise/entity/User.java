package io.javaapp.class_exercise.entity;

public class User {
    private Integer id = 0;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = generateId();
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int generateId() {
        return ++this.id;
    }
}
