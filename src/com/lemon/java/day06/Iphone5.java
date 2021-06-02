package com.lemon.java.day06;

public class Iphone5 extends Iphone4s{
    //用IPhone5发短信
    public  String brand = "iphone 5";
    public static void main(String[] args) {
        Iphone5 iphone5 = new Iphone5();
        iphone5.sendMessage();
        System.out.println(iphone5.brand);
    }
}
