package day5;

public class RotatedHalfPyramid {

    public static void main(String[] args) {

        // Number of rows
        int n = 4;

        // Print rotated half pyramid
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}