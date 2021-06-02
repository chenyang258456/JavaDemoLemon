package com.lemon.java.day01;

public abstract class AbstractDemo {
    public void test(){};
    public void test2(){};

}


class RealDemo extends AbstractDemo{
    String string1;
    String string2;
    @Override
    public void test() {
        System.out.println(string1);
    }

    @Override
    public void test2() {
        System.out.println(string2);
    }
    public RealDemo(String string1 ,String string2){
        this.string1 = string1;
        this.string2 = string2;
    }
}

class  RunDemo{
    public static void main(String[] args) {
        RealDemo realDemo = new RealDemo("hello","world");
        realDemo.test();
        realDemo.test2();
    }
}