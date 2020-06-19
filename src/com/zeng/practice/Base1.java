package com.zeng.practice;

public class Base1 {
    private String baseName = "base";
    public Base1()
    {
        callName();
    }

    public void callName()
    {
        System. out. println(baseName);
    }

    static class Sub extends Base1
    {
        private String baseName = "sub";
        public void callName()
        {
            System. out. println (baseName) ;
        }
    }
    public static void main(String[] args)
    {
        //输出为null
        /*
         new Sub();在创造派生类的过程中首先创建基类对象，然后才能创建派生类。
         创建基类即默认调用Base()方法，在方法中调用callName()方法，由于派生类中存在此方法，
         则被调用的callName（）方法是派生类中的方法，此时派生类还未构造，所以变量baseName的值为null
         */
        Base1 b = new Sub();
    }
}
