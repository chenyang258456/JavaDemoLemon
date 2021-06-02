package com.lemon.java.day03;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,11,1,3};
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j]<nums[j+1]){
                    int tmp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }
        for (int num:nums) {
            System.out.println(num);
        }
    }

}
