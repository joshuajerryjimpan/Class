package com.pan.useswitch;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        while (!end) {
            System.out.println("Please insert your coin (1，5，10): ");
            String string = scanner.next();
            int num = Integer.parseInt(string);
            switch (num) {
                case 1:
                    System.out.println("1");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 10:
                    System.out.println("10");
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    break;
            }
        }
        System.out.println("END");
    }
}
