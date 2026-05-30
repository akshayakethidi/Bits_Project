package day5;
import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        if (n== 1)return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();

        System.out.print("factorial:" + factorial(n));
    }
    
    
}
