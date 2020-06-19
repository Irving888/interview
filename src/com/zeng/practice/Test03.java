package com.zeng.practice;

public class Test03 {
    //静态代码块最早执行
    static{
        int x = 5;//x是静态局部变量
    }
    static int x,y;//x,y默认被初始化为0；

    public static void main(String args[]){
        x--;
        myMethod( );
        System.out.println(x+y+ ++x);
    }
    public static void myMethod( ){
        y=x++ + ++x;
    }
}
