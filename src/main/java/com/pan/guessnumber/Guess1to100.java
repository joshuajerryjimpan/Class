package com.pan.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class Guess1to100 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int secret = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number "+ min +"-"+ max);
        String string = scanner.next();
        int n = Integer.parseInt(string);
        if (n > secret){
            max = n;

        }else if (n < secret){

        }
    }
}
