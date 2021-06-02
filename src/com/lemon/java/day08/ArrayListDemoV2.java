package com.lemon.java.day08;

import java.util.ArrayList;

public class ArrayListDemoV2 {
    public static void main(String[] args) {
        ArrayList<Student> arrayLists = new ArrayList<Student>();
        arrayLists.add(new Student("张三" ,18));
        arrayLists.add(new Student("李四" ,19));
        arrayLists.add(new Student("王五" ,20));
        for (Student student:arrayLists) {
            System.out.println(student.getName());
        }
    }
}
