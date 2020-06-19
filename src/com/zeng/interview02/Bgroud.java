package com.zeng.interview02;

public class Bgroud extends Thread{
    public static void main(String argv[]){
        Bgroud b = new Bgroud();
        b.run();
    }

    public void start(){
        for (int i = 0;i < 10;i++){
            System.out.println("value of i = "+i);
        }
    }
}
