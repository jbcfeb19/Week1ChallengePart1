package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println();
// Greeting
        System.out.println("Welcome! Let's Play Roll Dice! ");
// Variable to hold the sum.
        int sum = 0;
// userInput checks either roll again or lose their turn
        String userInput = "";

        do {
            // dice1 and dice2 hold two random numbers between 1 and 6
            int dice1 = 1 + rand.nextInt(6);
            int dice2 = 1 + rand.nextInt(6);

            // Printing out two dices
            System.out.println("Your rolls " + dice1 + " & " + dice2);

            if(dice1 == 1 &&  dice2 == 1){
                sum += 25;
                System.out.println("Score: " + sum);
            }else if(dice1 == 1 || dice2 == 1){
                // sum = sum + 0;
                sum += 0;
                System.out.println("Score: " + sum);
            } else {
                sum += dice1 + dice2;
                System.out.println("Score: " + sum);
            }

            // Ask the user if they want to roll again
            System.out.print("Roll again? ");
            userInput = input.next();

            System.out.println(); // Prints an empty line

        }while (sum <= 100 && userInput.equalsIgnoreCase("yes"));

// This line of code will print if the sum is over 100
        if(sum>=100) {
            System.out.println("You have scored over 100");
        }

// This line print if the sum is over 100 or they quit
        System.out.println("Thank you for playing!");
    }
}
