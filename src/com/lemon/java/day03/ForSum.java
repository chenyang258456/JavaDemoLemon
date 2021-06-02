package com.lemon.java.day03;

public class ForSum {
    public static void main(String[] args) {
        int OddNumberSum = 0;
        int EvenNumberSum =0;
        for (int i = 0; i <=100 ; i++) {
            if (i % 2==0){
                EvenNumberSum += i;
            }else{
                OddNumberSum +=i;
            }

        }
        System.out.println("奇数之和： "+OddNumberSum);
        System.out.println("偶数之和： "+ EvenNumberSum);
    }
}
