package day4;
import java.util.*;

public class Questions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = 0;
        int totalMarks = 0;
        int numberOfMarks = 0;

        do {
            System.out.println("Enter 1 to continue or 0 to exit");
            int number = sc.nextInt();

            if (number == 1) {

                System.out.println("Enter your marks:");
                marks = sc.nextInt();

                // FIX 1: update totals properly
                totalMarks = totalMarks + marks;
                numberOfMarks++;

                // FIX 2: validate and grade immediately (not later)
                if (marks > 100 || marks < 0) {
                    System.out.println("Invalid marks");
                }
                else if (marks >= 90) {
                    System.out.println("This is Good");
                }
                else if (marks >= 60) {
                    System.out.println("This is also Good");
                }
                else {
                    System.out.println("This is Good as well");
                }
            }

            else if (number == 0) {

                // FIX 3: compute average here if you actually want it
                if (numberOfMarks != 0) {
                    int avgMarks = totalMarks / numberOfMarks;
                    System.out.println("Average Marks: " + avgMarks);
                }

                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }

        } while (true);

        sc.close();
    }
}