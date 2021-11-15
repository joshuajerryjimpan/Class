package com.pan.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class Guess1to100Again {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        System.out.println("Numer:" + min + "-" + max);
        System.out.println("Enter a number:");
        String s = scanner.next();
        int n = Integer.parseInt(s);
        if (n > secret) {

        } else {
            if (n < secret) {

            } else {

            }
        }
    }
}
