// Q1.Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.



// Write a Java program that:

// Takes an integer from the user.
// Uses a switch statement to print:
// 1 → January
// 2 → February
// 3 → March
// 4 → April

// If the user enters anything else, print:

// Invalid Month

// Use break correctly in every case.


package day3;
import java.util.*;
public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Question 1 Answer
        // System.out.println("what task do you want calculation do you want to perform. \n1.+\n2.-\n3./\n4.*");        
        // System.out.println("Enter the symbol / number to perform that task.");
        // String symbol = sc.nextLine();
        // System.out.print("Enter the first number: ");
        // int number_1 = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int number_2 = sc.nextInt();
       

        // switch (symbol){
        //     case "+":
        //         System.out.println(number_1 + number_2);
        //         break;
        //     case "-":
        //         System.out.println(number_1 - number_2);
        //         break;
        //     case "/":
        //         System.out.println(number_1 / number_2);
        //         break;
        //     case "*" :
        //         System.out.println(number_1 * number_2);
        //         break;
        //     default:
        //         System.out.println("you have entered wrong value");
        //         break;

        // }
        System.out.println("Enter the number to check the months name: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                
                System.out.println("Jan");
                break;
            case 2:
                
                System.out.println("feb");
                break;
            case 3:
                
                System.out.println("March");
                break;
            case 4:
                
                System.out.println("April");
                break;
            case 5:
                
                System.out.println("May");
                break;
            case 6:
                
                System.out.println("June");
                break;
            case 7:
                
                System.out.println("July");
                break;
            case 8:
                
                System.out.println("Aug");
                break;
            case 9:
                
                System.out.println("Sep");
                break;
            case 10:
                
                System.out.println("Oct");
                break;
            case 11:
                
                System.out.println("Nov");
                break;
            case 12:
                
                System.out.println("Dec");
                break;
            default:
                System.out.println("wrong value");
                break;
        }



        sc.close();
    

    }
}
