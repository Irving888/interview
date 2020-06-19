package com.zeng.practice;

/*
在你面前有一个n阶的楼梯，你一步只能上1阶或2阶。请问，当N=11时，
你可以采用多少种不同的方式爬完这个楼梯（）；当N=9时呢？
刚好是一个斐波那契数列；
 */
public class Test09 {
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(fun1(4));
    }

    public static int fun1(int a){
        if(a == 1){
            return 1;
        }else if(a == 2){
            return 2;
        }else {
            return fun1(a-1) + fun1(a - 2);
        }
    }
}
