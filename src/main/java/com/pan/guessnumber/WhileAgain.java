package com.pan.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class WhileAgain {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(11);
        boolean endGame = true;
        while (endGame){
            System.out.println("Please enter the number 1 to 10 :");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            int num = Integer.parseInt(string);
            if (num < secret){
                System.out.println("Bigger");
            }else if (num == secret){
                System.out.println("Bingo");
                endGame = false;
            }else {
                System.out.println("Smaller");
            }
        }
        System.out.println("Bye Bye !");
    }
}
