package day5;

public class InvertedHalfPyramid {

    public static void main(String[] args) {

        // Number of rows
        int n = 4;

        // Print inverted half pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}