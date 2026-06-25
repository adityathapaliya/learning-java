package day5;

public class FloydsTriangle {

    public static void main(String[] args) {

        // Number of rows
        int n = 4;
        int number = 1;

        // Print Floyd's Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}