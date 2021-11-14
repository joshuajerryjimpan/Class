package com.pan.eclipse;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number(from 1 to 10)");
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int num = Integer.parseInt(s);
        if(num>secret) {
            System.out.println("Smaller");
        }
        if(num==secret) {
            System.out.println("Bingo");
        }
        if(num<secret) {
            System.out.println("Bigger");
        }
    }
}
