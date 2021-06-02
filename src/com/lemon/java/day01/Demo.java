package com.lemon.java.day01;

public class Demo {

    public void test(){
        System.out.println("真好玩");
    }
}

class Demo2 extends Demo{

    String string1 ;
    public Demo2(String string1) {

        this.string1 = string1;
    }

    @Override
    public void test() {
        System.out.println(this.string1+"还是好玩");;
    }
}


class runDemo{
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2("python");
//        System.out.println(demo2.string1);
        demo2.test();
    }
}