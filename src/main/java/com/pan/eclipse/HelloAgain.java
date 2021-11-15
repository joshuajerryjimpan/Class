package com.pan.eclipse;

public class HelloAgain {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        int age = 19;
        age = age - 1;
        System.out.println(age > 18);

        float w = 49.5f;
        System.out.println(w);

        int total = 80;
        total = total + 40;
        System.out.println(total);

        boolean adult = true;
        System.out.println("adult "+adult);

        int n1 = 10;
        boolean result1 = n1 > 2;
        System.out.println("1 : "+result1);

        int n2 = 10;
        boolean result2 = n2 > 2;
        result2 = n2 >= -3 && n2 <= 4;
        System.out.println("2 : "+result2);

        if (result1){
            System.out.println("Good !");
        }else {
            System.out.println("Bad !");
        }

        if (result2){
            System.out.println("Good !");
        }else {
            System.out.println("Bad !");
        }
    }
}
