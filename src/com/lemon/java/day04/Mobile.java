package com.lemon.java.day04;

public class Mobile {
    String brand;
    int price;

    public void getMobileInfo(){
        System.out.println("手机品牌： "+brand+" 手机价格： "+price);
    }
    public void sendMessage(String[] names){
        for (String name:names
             ) {
            System.out.println(name+"，您好啊！");
            System.out.println("信息来自"+brand);
        }

    }

    public Mobile() {
    }

    public Mobile(String brand,int price) {
        this.brand = brand;
        this.price = price;
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile("华为",8888);
        mobile1.getMobileInfo();
        mobile2.getMobileInfo();
        String[] names = {"陈淑英", "陈昌柱"};
        mobile2.sendMessage(names);
    }
}
