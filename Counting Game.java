package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String Counting = "";
        System.out.println("Hello! What is your name?");
        System.out.println("Abaddon");
        System.out.println("Well Abaddon, I am thinking of a number between 1 and 20.");
        System.out.println("Take a guess.");
        Scanner countingGame = new Scanner(System.in);
        int random,guess,attempts;
        random generator = new random();
        String game = countingGame.next();
        while (Counting != "random" || Counting != "guess") {
        }
        if (guess < random) {
                System.out.print("Lower!");
            }
            else {
                System.out.print("Higher!");
        }
    }
}