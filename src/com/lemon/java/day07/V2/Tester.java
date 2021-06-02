package com.lemon.java.day07.V2;

public class Tester {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Teacher teacher = new Teacher();
        Doctor doctor = new Doctor();
        cooker.showDailyLife();
        System.out.println("----------------------");
        teacher.showDailyLife();
        System.out.println("----------------------");
        doctor.showDailyLife();
    }
}
