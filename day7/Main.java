package day7;
import java.util.*;

public class Main {

    // public static void py(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] marks = {85, 90, 78, 92, 88};

    //     py(marks);
    // }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements one by one:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}

   