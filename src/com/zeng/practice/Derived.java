package com.zeng.practice;

class Base{
//    public Base(){}

    public Base(String s){
        System.out.print("B");
    }
}
public class Derived extends Base {
    /*
    在调用子类构造器之前，会先调用父类构造器，
    当子类构造器中没有使用"super(参数或无参数)"指定调用父类构造器时，
    是默认调用父类的无参构造器，如果父类中包含有参构造器，却没有无参构造器，
    则在子类构造器中一定要使用“super(参数)”指定调用父类的有参构造器，不然就会报错。
     */
    public Derived (String s) {
        super(s);
        System.out.print("D");
    }
    public static void main(String[] args){
        new Derived("C");
    }
}
