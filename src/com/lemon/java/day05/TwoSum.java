package com.lemon.java.day05;



public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] results = twoSum.twoSum(new int[]{1,2,3,4,5},5);
        for (int result:results ){
            System.out.println(result);
        }
    }
}
