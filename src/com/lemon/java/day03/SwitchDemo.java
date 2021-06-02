package com.lemon.java.day03;

public class SwitchDemo {
    public static void main(String[] args) {
        String name = "李1华";
        switch (name){
            case "李华":
                System.out.println("好名字");
                break;

            case "小明":
                System.out.println("假的");
                break;

            default:
                System.out.println("zaijian");
                break;

        }
    }
}
