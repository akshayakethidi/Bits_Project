package day1;
import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Zoom");
        } else if (num % 3 == 0) {
            System.out.println("Zip");
        } else if (num % 5 == 0) {
            System.out.println("Zap");
        } else {
            System.out.println("Number is not divisible by 3 or 5");
        }

        sc.close();
    }
}