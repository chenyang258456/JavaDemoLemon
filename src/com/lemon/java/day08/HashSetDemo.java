package com.lemon.java.day08;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    /*
    * 无须、不可重复*/

    public static void main(String[] args) {
        HashSet<String> hashSet= new HashSet<String>();
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains("恒心"));
//        System.out.println(hashSet.remove("张三"));
//        Object[] objs = hashSet.toArray();
//        for (Object obj:objs
//             ) {
//            System.out.println(obj);
//        }
        //遍历set集合
        Iterator<String> iterator = hashSet.iterator();
//        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
