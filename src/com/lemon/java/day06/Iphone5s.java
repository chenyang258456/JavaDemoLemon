package com.lemon.java.day06;

public class Iphone5s extends Iphone5{
    protected   String brand = "iphone 5s";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Iphone5s() {
        System.out.println("5s的构造方法");;
    }
}
