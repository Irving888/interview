package com.zeng.interview02;

//考察++i和i++;
public class Test {
    static int i;
    public int Test(){
        i++;
        return i;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.Test();
        System.out.println(test.Test());
    }
}
