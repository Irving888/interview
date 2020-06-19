package com.zeng.practice;

import java.util.ArrayList;
import java.util.List;

public class NameList
{
    private List names = new ArrayList();
    public synchronized void add(String name)
    {
        names.add(name);
    }
    public synchronized void printAll()     {
        for (int i = 0; i < names.size(); i++)
        {
            System.out.print(names.get(i) + " ");
        }
    }

    public static ThreadLocal<Integer> ti = new ThreadLocal<Integer>();

    public static void main(String[]args)
    {
        final NameList sl = new NameList();
        final int j = 1;
        for (int i = 0; i < 2; i++)
        {
            new Thread()
            {
                public void run()
                {
                    ti.set(1);
                    sl.add("A");
                    sl.add("B");
                    sl.add("C");
                    sl.printAll();
                    String name = getName();
                    System.out.println(name);
                    System.out.println(ti.get());
                }
            }.start();
        }
    }
}
