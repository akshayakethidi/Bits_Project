package day1;
import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 500; // assuming each subject is out of 100
        int sum = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            sum += marks;
        }

        double percentage = (sum / (double) totalMarks) * 100;

        System.out.println("Total Percentage = " + percentage + "%");

        // Sample criteria
        if (percentage >= 75) {
            System.out.println("Grade: Distinction");
        } else if (percentage >= 60) {
            System.out.println("Grade: First Class");
        } else if (percentage >= 50) {
            System.out.println("Grade: Second Class");
        } else if (percentage >= 35) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}