package com.lemon.java.day06;

public class Iphone6 extends Iphone5s{
//    public  String brand = "iphone 6";
    public void shape(){
        System.out.println("Iphone6特有创新");
    }

    @Override
    public void sendMessage() {
        System.out.println("短信来自IPhone6");;
    }

    public Iphone6(String brand) {
        super();
        this.brand =brand;
    }

    public static void main(String[] args) {
        Iphone6 iphone6 = new Iphone6("iphone6");
        iphone6.sendMessage();
        System.out.println(iphone6.brand);
//        iphone6.brand = "iphone6";
//        iphone6.setBrand("Iphone6");
//        System.out.println(iphone6.getBrand());
//        System.out.println(iphone6.brand);

    }

}
