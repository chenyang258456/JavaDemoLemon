package com.lemon.java.day01;

public class Variable {
    public static void main(String[] args) {
        boolean aa  = false;
        float ff =   3.12f;//小数被默认提升为double（8个字节）类型，float4个字节，类型自动提升
        double dd = 3.12;
        char cc = '1';
        String ss = "ss";
        System.out.println(aa);
        System.out.println((int)ff);

    }
}
