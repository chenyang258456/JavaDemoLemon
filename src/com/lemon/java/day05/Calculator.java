package com.lemon.java.day05;

import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multip(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数据：");
        double a = scanner.nextDouble();
        System.out.println("输入运算符");
        String operator = scanner.next();
        System.out.println("输入第二个数据");
        double b = scanner.nextDouble();
        double result=0;
        if ("+".equals(operator)){
            result = calculator.add(a,b);
        }else if ("-".equals(operator)){
            result = calculator.sub(a,b);
        }else if ("*".equals(operator)){
            result = calculator.multip(a,b);
        }else if("/".equals(operator)){
            result = calculator.div(a,b);
        }

        //根据输入的运算符，调用相应的方法完成数据运算
        System.out.println(result);
    }
}
