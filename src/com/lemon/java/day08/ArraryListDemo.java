package com.lemon.java.day08;

import java.util.ArrayList;
import java.util.List;

public class ArraryListDemo {
    /*ArrayList 有序 可重复
    clear() 将集合里的所有数据清空
    toArray().将集合转化为对应数据类型的数组

    * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.isEmpty());
        System.out.println(list.contains("张三"));
//        String name = list.remove(2);
//        System.out.println(name);
        list.set(2,"尼哥");
        System.out.println(list.get(2));

    ArraryListDemo demo = new ArraryListDemo();
    }
}
