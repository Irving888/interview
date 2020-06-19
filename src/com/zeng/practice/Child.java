package com.zeng.practice;


public class Child extends Person{
    public String grade;
    public static void main(String[] args){
        Person p = new Child();
        System.out.println(p.name);
    }
}
/*修改前：
1.一个java文件里，public 的类只能出现一个，只能出现一个，只能出现一个，
    否则，不管你用哪一个类名命名文件名编译器都会报错
2.关于多态。子类继承了父类的所有成员，包括private权限的成员变量，
    但是继承的子类具有私有变量的拥有权但是没有使用权。
3.private的成员变量，根据权限修饰符的访问控制范围，只有在类内部才能被访问，
    就算是他的子类，也不能访问。

public class Person{
    private String name = "Person";
    int age=0;
}*/

//修改后：
class Person{
     String name = "Person";
    int age=0;
}