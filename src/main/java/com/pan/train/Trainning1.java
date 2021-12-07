package com.pan.train;


import java.util.Random;
import java.util.Scanner;

public class Trainning1 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret =random.nextInt(100)+1;
        System.out.println(secret);
        int max = 100;
        int min = 1;
        boolean win = false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please guess the number from "+min+" to "+max);
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            int num = Integer.parseInt(string);
            if (num > secret){
                System.out.println("smaller");
                max = num;
            }else if (num == secret){
                win = true;
                break;
            }else if (num < secret){
                System.out.println("Bigger");
                min = num;
            }
        }
        if (win){
            System.out.println("YOU WIN !!");
        }else {
            System.out.println("YOU LOSE !!");
        }
    }
}
