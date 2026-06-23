package day3;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get greeting in your language \n"+"press 1 to get greeting in nepali \npress 2 to get greeting in Engilsh \npress 3 to get greeting in spanish ");
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        switch (number ) {
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("hola");
                break;
            default:
                System.out.println("you have entered wrong value");
                break;
        }
        sc.close();
    }
}
