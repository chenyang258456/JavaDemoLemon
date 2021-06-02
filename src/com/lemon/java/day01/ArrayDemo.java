package com.lemon.java.day01;
/*
* 数组的容量是确定的，定义数组的时候必须制定数组的大小
* 数组的类型是确定的，定义数组的时候必须声明数组的类型，一种类型的数组职能放一种类型的数据*/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] myArray1 = new int[3]; //创建一个数组，但是没有初始化数组的元素，需要显示指定数组的大小
        //不传入数值，数组内有默认值0
        int[] myArray2 = {1,2,3};//创建一个数组，并已知数组的内部元素
        myArray1[0]=1;
        myArray1[1]=2;
        myArray1[2]=3;

        String[][] names = {{"消化","斗鱼"},{"sss","ssss","Assess"}};
        //创建一个多维数组，已知数组内部每个数组的所有元素
        String [][] names2 = new String[4][3];
        System.out.println(myArray1[0]+myArray1[1]+myArray1[2]);
        System.out.println(names[1][2]);

    }
}
