package day3;
import java.util.*;

public class ifelsestatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number to check if its odd or even");
        // int number = sc.nextInt();
        
        // if(number%2==0){
        //     System.out.println("The number is even ");
        // } else {
        //     System.out.println("the number is odd");
        // }

        // System.out.println("Enter 2 number to check which of them are greater ");
        // System.out.print("Enter the first number: ");
        // int number_1 = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int number_2 = sc.nextInt();
        
        // if (number_1 == number_2){
        //     System.out.println("The numbers are equal");
        // } else if (number_1 < number_2){
        //     System.out.println("Second number is greater ");
        // } else {
        //     System.out.println("Fists number is greater");
        // }

        System.out.println("Enter a number to get greeting in your language \n"+"press 1 to get greeting in nepali \npress 2 to get greeting in Engilsh \npress 3 to get greeting in spanish ");
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number == 1){
            System.out.println("Namaste");
        } else if (number == 2){
            System.out.println("Hello");
        }else if (number == 3) {
            System.out.println("Hola");
        }else   {
            System.out.println("The value is invalid");
        }

         sc.close();


    }
}
