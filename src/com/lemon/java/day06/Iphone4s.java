package com.lemon.java.day06;

public class Iphone4s extends Mobile {
    public  String brand = "iphone 4s";
    public void passwordUnlock(){
        System.out.println("密码解锁");
    }
    public void brand(){
        System.out.println(this.brand);
    }

    public static void main(String[] args) {
        Mobile iphone4s = new Iphone4s();//对象类型向上提升
        Iphone4s iphone4s1 = (Iphone4s) iphone4s;//对象类型向下强制转换
        iphone4s1.brand();
    }
}
