package com.lemon.java.day08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
* 取值：get()
* 添加数据：put()
* 移除：remove()
* 获取所有的键：keyset()
* 获取所有的值：values()
* 其他API：size(),containsKey(),containsValue()*/
public class HashMapDemo {
    /*
    * 以键值对的形式来保存数据
    * 键值不可以重复，重复时，后者键值对覆盖前者*/
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("name","名扬");
        map.put("age","18");
        String name = map.get("name");
        String age = map.get("age");
        System.out.println(name);
        System.out.println(age);
//        String name2 = map.remove("name");
//        System.out.println(name2);
        System.out.println(map.size());
        System.out.println(map.containsKey("age"));
        System.out.println(map.containsValue("18"));
        Set<String> sets = map.keySet();
        Collection<String> collections = map.values();
        for (String set:sets) {
            System.out.println(set);
        }
        for (String value:collections) {
            System.out.println(value);
        }

        //迭代，遍历map:依次拿出map中所有的键值对

        Set<String> keys = map.keySet();
        for (String key:keys
             ) {
            String value = map.get(key);
            System.out.println("key: "+key+" "+"Value: "+value);
        }
        //Entry代表一个key-value
        Set<Entry<String,String>> setS = map.entrySet();
        for (Entry<String, String> entry:setS) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }




}
