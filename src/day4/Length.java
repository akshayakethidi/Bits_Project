package day4;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int length=str.length();
        System.out.println("length of the string is "+length);
    }
}
