package com.pan.popquiz;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(20)+1;
        int max = 20;
        int min = 1;
        boolean win = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please guess the number from "+min+" to "+max);
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            int num = Integer.parseInt(string);
            if (num > secret) {
                System.out.println("Smaller");
                max = num;
            }else if (num == secret){
                win = true;
            }else if (num < secret){
                System.out.println("Bigger");
                min = num;
            }
        }
        if (win){
            System.out.println("YES, YOU WIN! ");
        }else {
            System.out.println("NO, YOU LOSE! "+"\n"+"The secret number is "+secret);
        }
    }
}
