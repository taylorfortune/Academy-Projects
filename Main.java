package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String Cave = "";
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see three caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. Another dragon");
        System.out.println("is greedy and hungry, and will eat you on sight.");
        System.out.println("What cave will you go into?(1 or 2)");

        Scanner dragonchoice = new Scanner(System.in);
        String dragon = dragonchoice.next();
        while (Cave != "1" && Cave != "2"){

            System.out.println("You approach the cave.");
            System.out.println("It is dark and spooky");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and");
            System.out.println("Gobbles you down in one bite");
        }
            if (dragon == "x") {
                System.out.println("You approach the cave.");
                System.out.println("It is dark and spooky");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and");
                System.out.println("Gobbles you down in one bite");
            }else
                System.out.println("Congratulations you have reached the organs unguared treasure");

    }
}