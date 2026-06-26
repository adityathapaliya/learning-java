package day6;
import java.util.Scanner;

public class SumToN {
    
    public static int sumFirstN(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (N < 1) {
            System.out.println("Invalid input: N should be at least 1.");
        } else {
            int result = sumFirstN(N);
            System.out.println("Sum = " + result);
        }

        sc.close();
    }

  
}
