package com.Javaapp;

public class Hello {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setPassword("123");
        user.setAge(20);
        System.out.println(user);
        System.out.println(System.currentTimeMillis());
    }
}
