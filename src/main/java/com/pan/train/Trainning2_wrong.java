package com.pan.train;

import java.util.Random;
import java.util.Scanner;

public class Trainning2_wrong {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        System.out.println(secret);
        int min = 1;
        int max = 100;
        boolean win = false;
        while (win) {
            System.out.println("Please enter your number from " + min + " to " + max);
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            int num = Integer.parseInt(string);
            if (num < secret) {
                System.out.println("Bigger");
                min = num;
            } else if (num > secret) {
                System.out.println("Smaller");
                max = num;
            } else if (num == secret) {
                win = true;
            }
        }
        if (win) {
            System.out.println("YOU WIN !!");
        } else {
            System.out.println("YOU LOSE !!");
        }
    }
}
