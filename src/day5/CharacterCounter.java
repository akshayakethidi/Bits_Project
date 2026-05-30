package day5;

import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Counters
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChars = 0;
        
        // Loop control variable
        int i = 0;

        // Convert the input to lowercase to make checking easier
        String str = input.toLowerCase();

        while (i < str.length()) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            // Check if it's a consonant (any other letter from a to z)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } 
            // Check if it's a decimal/digit (0 to 9)
            else if (ch >= '0' && ch <= '9') {
                digits++;
            } 
            // Check if it's a special character (ignoring empty spaces)
            else if (ch != ' ') {
                specialChars++;
            }

            // Move to the next character
            i++;
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Decimals (Digits): " + digits);
        System.out.println("Special Characters: " + specialChars);

        scanner.close();
    }
}