package day2;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking user's name
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Your name is " + name);

        // Taking two numbers as input
        System.out.println("Enter the value of a and b to find its sum");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Displaying sum
        System.out.println("The sum of 2 numbers is: " + (a + b));

        sc.close(); // closing scanner (good practice)
    }
}