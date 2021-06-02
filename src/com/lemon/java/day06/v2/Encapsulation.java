package com.lemon.java.day06.v2;

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(28);
        int age = student.getAge();
        System.out.println(age);
    }
}
