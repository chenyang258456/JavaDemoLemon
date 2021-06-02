package com.lemon.java.day03;
//continue 跳过本次循环 break终止整个循环
public class ForDemoSum {
    public static void main(String[] args) {
        int sum =0;
        for (int i=1;i<=10;i++){
            if (i == 5){
                break;
            }else{
                System.out.println(i);
                sum += i;

            }
        }
        System.out.println(sum);

    }
}
