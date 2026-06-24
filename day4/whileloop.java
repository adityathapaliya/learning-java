package day4;
import java.util.*;

public class whileloop {
    public static void main (String [] args){
     Scanner sc = new Scanner(System.in); 
    // int i = 0;
    // while (i <= 10){
    //     System.out.println(i++);
    // }


        // int i = 0;
        // while (i <= 200){
        //     if( i % 2 == 0)
        //      System.out.print(i+" ");
        //     i += 1;
        // }
    
    System.out.println("Enter a number to see its Multiplication Table");
    int i = sc.nextInt();
    int j = 1;
    while (j <= 10){
        System.out.println(i  + " x " + j + " = " + (i * j));
        j++;
    } 

    sc.close();

    }
}
