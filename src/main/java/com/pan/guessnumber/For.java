package com.pan.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Please enter the number from 1 to 10 :");
            String string = scanner.next();
            int num = Integer.parseInt(string);
            if (num < secret){
                System.out.println("Bigger");
            }else if (num == secret){
                System.out.println("Bingo");
                break;
            }else if (num >secret){
                System.out.println("Smaller");
            }
        }
        System.out.println("Bye Bye !");
    }
}
