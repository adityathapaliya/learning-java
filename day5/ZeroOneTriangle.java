package day5;

public class ZeroOneTriangle {

    public static void main(String[] args) {

        // Number of rows
        int n = 5;

        // Print 0-1 Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                // Print 1 if the sum of row and column is even, otherwise print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}