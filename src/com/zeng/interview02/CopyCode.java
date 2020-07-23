package com.zeng.interview02;

import java.util.Scanner;

public class CopyCode {
    public static void main(String[] args) {
        /**
         * num / 10000; //万位
         *(num % 10000) / 1000; //千位
         *(num % 1000) / 100; //百位
         *(num % 100) / 10; //十位
         * num % 10; //个位
         */
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if((num/10000)==(num%10) && ((num%10000)/1000)==((num%100)/10)&&num>=10000&&num<=99999){
            System.out.println("这个bai数是回文数！！！！！");
        }else{
            System.out.println("这个数不是回文数或者不是五位数！");
        }
    }
}
