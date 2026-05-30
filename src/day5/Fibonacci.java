package day5;

public class Fibonacci {
     public class FibonacciIterative {
    public static void printFibonacci(int count) {
        int first = 0, second = 1;
        
        System.out.print("Fibonacci Series (" + count + " numbers): ");
        
        for (int i = 1; i <= count; ++i) {
            System.out.print(first + " ");

            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this to print more or fewer numbers
        printFibonacci(n);
    }
}
}
