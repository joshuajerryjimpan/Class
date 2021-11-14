package com.pan.eclipse;

import java.util.Random;

public class Hello {
    public static void main(String[] args) {
        int z = 18;
        z = z*2;
        System.out.print(z);
        System.out.print(" Hello ");
        System.out.println("X is "+z);
        double d = Math.random();
        System.out.println(d);
        double pi = 3.141592653;
        System.out.println(pi+0.05);

        String name = "Joshua";
        System.out.println(name);
        Random x = new Random(10);
        Random y = new Random(10);
        int r1 = x.nextInt();
        int r2 = y.nextInt();
        System.out.println(r1);
        System.out.println(r2);

        Random g = new Random();
        float f = g.nextInt(100);
        int i = g.nextInt(100);
        System.out.println(g);
        System.out.println(f);
        System.out.println(i);
    }
}
