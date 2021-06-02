package com.lemon.java.day07.V2;

public abstract class Worker {
    public abstract void work();

    public void showDailyLife(){
        System.out.println("起床");
        System.out.println("上班");
        work();
        System.out.println("下班");
        System.out.println("睡觉");
    }
}
