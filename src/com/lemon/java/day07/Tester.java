package com.lemon.java.day07;

import javax.print.Doc;

public class Tester {
    public void showWork(Worker worker){
        worker.work();
    }

    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Doctor doctor = new Doctor();
        Teacher teacher = new Teacher();
        Tester tester = new Tester();
        tester.showWork(cooker);
        tester.showWork(doctor);

    }
}
