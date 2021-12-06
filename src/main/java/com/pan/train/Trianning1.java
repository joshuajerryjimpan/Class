package com.pan.train;

import java.util.Random;
import java.util.Scanner;

public class Trianning1 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);
        boolean playGame = true;
        while (playGame){
            System.out.println("Please enter the number(from 1 to 10)");
            String string = scanner.next();
            int number = Integer.parseInt(string);
            if (number > secret){
                System.out.println("Smaller");
            }else if (number == secret){
                System.out.println("Bingo");
                break;
            }else {
                System.out.println("Bigger");
            }
        }
        System.out.println("Bye");
    }
}
