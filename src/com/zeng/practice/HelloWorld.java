package com.zeng.practice;

public class HelloWorld {
    public static void main(String []args) throws InterruptedException {
        String s = "hello";
        String t = "hello";
        char c[] = {'h','e','l','l','o'} ;
        System.out.println(s.equals(t));//true
        //c++中定义的东西，不要在java中混为一谈。(对这句话我不负责任)
        System.out.println(t.equals(c));//false
        System.out.println(s==t);//true
        System.out.println(t.equals(new String("hello")));//true
        //这个不相等，因为语句中new的字符串不在常量池，是在堆
        System.out.println(t==new String("hello"));//false
        //这样可以判断字符数组与字符串是否包含同样的字符序列
        System.out.println(t.equals(new String(c)));//true

        HelloWorld hw = new HelloWorld();
        hw.waitForSignal();
    }

    /*
    第二个错误的地方是， synchronized 的目标与 wait() 方法的物件不相同，
    会有 IllegalMonitorStateException ，不过 InterruptedException 会先出现

    void waitForSignal() throws InterruptedException {
        Object obj = new Object();
        synchronized(Thread.currentThread())
        {
            obj.wait();
            obj.notify();
        }
    }*/

    void waitForSignal() {
        Object obj = new Object();
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.notify();
        }
    }

}
