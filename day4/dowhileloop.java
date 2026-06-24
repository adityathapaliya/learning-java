package day4;

import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Secret number to guess
        int secretNumber = 10;

        // User input variable (initialized to enter loop)
        int user_number = 0;

        // do-while runs at least once
        do {
            System.out.println("Guess the number between 1 and 10:");

            // Take user input
            user_number = sc.nextInt();

            // Check if guess is wrong
            if (user_number != secretNumber) {
                System.out.println("You got it wrong.");
            }

        } while (user_number != secretNumber);

        // Correct guess message
        System.out.println("You got it!");

        sc.close();
    }
}