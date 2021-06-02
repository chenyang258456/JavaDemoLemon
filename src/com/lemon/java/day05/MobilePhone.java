package com.lemon.java.day05;

public class MobilePhone {
    /*
     * 品牌*/
    public String brand;
    //产品类型
    public String generation;
    //价格
    public int price;

    public void sendMessage(String name) {
        System.out.println(name + ",晚上有空吗，一起吃饭");
        System.out.println("-------此短信通过【" + this.brand + this.generation + "】手机发出");
    }

    public String getBrand() {
        return brand;
    }

    public String getGeneration() {
        return generation;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MobilePhone(String brand, String generation, int price) {
        this.brand = brand;
        this.generation = generation;
        this.price = price;
    }

    public MobilePhone() {
    }

    public static void main(String[] args) {
        //用华为P20，给小明同学发短信
        MobilePhone mobilePhone = new MobilePhone("华为", "P20", 8888);
        mobilePhone.sendMessage("小明");
        String score = mobilePhone.score(60);
        System.out.println(score);
        mobilePhone.setBrand("小米");
        String brand = mobilePhone.getBrand();
        System.out.println(brand);
    }

    public String score(int score) {
        if (score <= 60) {
            return "C";
        } else if (score <= 80) {
            return "B";
        } else {
            return "A";
        }
    }

}
