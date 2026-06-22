package day2;

import java.util.*;

public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("your name is " + name);

        System.out.println("Enter the value of a and b to find its sum");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the sum of 2 number is: "+ (a+b));
    }
}


