package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("how many sides does your die have");
        int diceSides = input.nextInt();
        System.out.println("how many times do you want to roll it");
        int rollNum = input.nextInt();
        int[] arrayTally = new int[diceSides+1];

        for (int i = 1; i <= rollNum ; i++) {
            int min = 1;
            int max = diceSides;
            int rolledNum = random.nextInt((max - min)) + min;
            System.out.println(rolledNum);
            arrayTally[diceSides]++;
            for (int j = 1; j < rollNum; j++) {
                if (rolledNum == j){
                    arrayTally[j] = arrayTally[j] + 1;
                }
            }
        }
        System.out.println("Your tally's are");
        for (int i = 0; i < rollNum; i++) {
            System.out.println("number "+i +" was rolled " + arrayTally[i]+ " times");
        }







        /*
        System.out.println("first random int is " + random.nextInt(10));
        System.out.println("second random int is " + random.nextDouble());

        int min = 0;
        int max = 26;
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z"};
        int newRandom = random.nextInt((max - min) + 1) + min;
        System.out.println(array[newRandom]);


        double randomDouble = Math.random();

        int rand = (int) (Math.random() * 10);
        System.out.println(randomDouble);
        System.out.println(rand);

         */


    }
}
