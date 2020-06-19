package com.zeng.interview02;

import java.util.ArrayList;

public class Day200529 {
    public static void main(String[] args) {
        //题一：
        String s = "story";
//        s += "books";
        s = s + 100;
//        int len = s.length();
//        String t = s + "xxxs";
//        System.out.println(s);

        //题二：
        ArrayList<String> lists = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<Object> list3 = new ArrayList<String>();//Provided:ArrayList<String> Required:ArrayList<Object>
        ArrayList list4 = new ArrayList<String>();
        list4.add("hello");
        list4.add("java");
        list4.add("maven");
        for (Object o : list4) {
//            System.out.println(o);
        }

        //题三：
        int t = 1;
        int a = 2;
        int b = -1;

        if((a=b)>0)     t = a++;
//        System.out.println(t);

        String regex = "/^\\d*\\*[^\\d]*[\\w]{6}$/";
//        String target = "***abbcABCD_89";
//        String target = "abc*abcABCDEF";
//        String target = "123*abcABCD_89";
        String target = "123*ABCabcd-89";
        Boolean flag = target.matches(regex);
        if(flag){
            System.out.println("right");
        }else {
            System.out.println("false");
        }

    }

    //题五：考返回值
    double methodx(byte x,double y){
        return (short)x/y*2;
    }








}
