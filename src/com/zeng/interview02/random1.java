package com.zeng.interview02;

public class random1 {
    public static void main(String args[]) {

        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };

        t.start();//启动线程
        t.run();//正常执行

        System.out.print("ping");

    }

    static void pong() {
        System.out.print("pong");
    }
}
