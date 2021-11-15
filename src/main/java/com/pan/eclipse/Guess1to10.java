package com.pan.eclipse;

import java.util.Random;
import java.util.Scanner;

public class Guess1to10 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(11);
        System.out.println(secret);
        System.out.println("Please enter the number from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(string);
        int num = Integer.parseInt(string);
        if (num > secret){
            System.out.println("Smaller");
        }if (num == secret){
            System.out.println("Bingo");
        }if (num < secret){
            System.out.println("Bigger");
        }
    }
}
