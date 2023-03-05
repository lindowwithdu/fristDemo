package com.Javaapp;

public class User {
    private String name;
    private String password;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "two{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
