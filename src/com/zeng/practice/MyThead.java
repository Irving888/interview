package com.zeng.practice;

public class MyThead extends Thread{
    public static void main(String[] args) {
        MyThead t=new MyThead();
        MyThead s=new MyThead();

        System.out.println("t"+t.getName());
        System.out.println("s"+s.getName());
        t.start();
        System.out.println("one.");
        s.start();
        System.out.println("two.");
    }
    public void run() {
        System.out.println("Thread");
    }
}
