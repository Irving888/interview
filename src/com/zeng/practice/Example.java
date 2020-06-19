package com.zeng.practice;

public class Example{
    String str=new String("tarena");
    char[]ch={'a','b','c'};
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        //引用类型变量，传递的是地址，属于引用传递。
        str="test ok";
        ch[0]='g';
        System.out.println(str+" ");//这里改变的不是引用的值，而是引用str指向的常量不一样了而已
        //而这个引用的生命周期和当前方法的一样的，也就是方法结束，引用被杀死，也结束了，那么它刚才指向good的这个引用，就结束了
        System.out.println(ch);
    }
}
