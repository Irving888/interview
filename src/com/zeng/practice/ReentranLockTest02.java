package com.zeng.practice;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentranLockTest02 {
    public static void main(String[] args) {
        Counter1 counter1 = new Counter1();

        new Thread(new Runnable() {

            @Override
            public void run() {
                while (counter1.getCount() >= 0) {
                    counter1.desc1();
                }
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                while (counter1.getCount() >= 0) {
                    counter1.desc2();

                }
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                while (counter1.getCount() >= 0) {
                    counter1.desc3();

                }
            }
        }).start();
    }
}

class Counter1 {
    private int count = 100;
    private Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();
    boolean state = true;

    public void desc1() {
        lock.lock();// 上锁

        try {
            while (state)
                condition1.await();// 线程等待

            if (count >= 0) {
                System.out.println(Thread.currentThread().getName() + "--->" + count);
                count--;
            }
            state = true;// 改变状态
            condition2.signal();// 唤醒调用了condition2.await()线程

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();// 释放锁
        }
    }

    public void desc2() {
        lock.lock();// 上锁

        try {
            while (!state)
                condition2.await();// 线程等待

            if (count >= 0) {
                System.out.println(Thread.currentThread().getName() + "--->" + count);
                count--;
            }
            state = false;// 改变状态
            condition3.signal();// 唤醒调用了condition1.await()线程

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();// 释放锁
        }
    }

    public void desc3() {
        lock.lock();// 上锁

        try {
            while (!state)
                condition3.await();// 线程等待

            if (count >= 0) {
                System.out.println(Thread.currentThread().getName() + "--->" + count);
                count--;
            }
            state = false;// 改变状态
            condition1.signal();// 唤醒调用了condition1.await()线程

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();// 释放锁
        }
    }

    public int getCount() {
        return count;
    }
}