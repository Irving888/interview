package com.zeng.practice;

class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

public class TestDog{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
        /*
        Dog继承自Animal。
        当用Dog对象初始化Animal类对象时，完成了对Animal对象中方法与变量的覆盖与隐藏，
        也就是b.move()调用的是Dog中move()方法。而Animal中本身并没有bark()方法，
        不存在被覆盖的情况，亦无法访问，也就是b.bark()会报错。
         */
//        b.bark();
    }
}
