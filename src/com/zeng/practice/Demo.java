package com.zeng.practice;

public class Demo {
    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num = num + i;
            //count = count++  原理是 temp = count； count = count+1 ；
            // count = temp；   因此count始终是0 这仅限于java 与c是不一样的
            count = count++;
        }
        System.out.println("num * count ="+(num * count));
        System.out.println(count);
        System.out.println(num);

        String a = new String("myString");
        String b = "myString";
        String c = "my" + "String";
        String d = c;
        System.out.print(a == b);
        System.out.print(a == c);
        System.out.print(b == c);
        System.out.print(b == d);
    }
}
