package com.zeng.practice;

class Base3
{
    public void method()
    {
        System.out.println("Base");
    }
}
class Son extends Base3
{
    public void method()
    {
        System.out.println("Son");
    }

    public void methodB()
    {
        System.out.println("SonB");
    }
}
public class Test12
{
    public static void main(String[] args)
    {
        Base3 base3 = new Son();
        base3.method();
        /*
        这句new 了一个派生类，赋值给基类，所以下面的操作编译器认为base对象就是Base类型的
        Base类中不存在methodB()方法，所以编译不通过
         */
//        base3.methodB();
    }
}
