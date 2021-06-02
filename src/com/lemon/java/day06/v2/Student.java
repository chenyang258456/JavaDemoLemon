package com.lemon.java.day06.v2;

public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Child extends Student{
    public static void main(String[] args) {
        Child child = new Child();
        child.setAge(18);
        System.out.println(child.getAge());
    }
}
