package com.zeng.practice;

public class Test06 {
    public static void main(String args[]) {
        int i = -5;
        /*
        java中的i++和++i在java语言层面上来看使用中间量机制，i=i++，i不变，i=++i相当于++i，
        而结合在一个语句里使用则会报错，因为++后应该跟变量。
        同理，i=(++i)++也是不对的。
         */

//        i =  ++(i++);//Variable expected
        System.out.println(i);
    }
}
