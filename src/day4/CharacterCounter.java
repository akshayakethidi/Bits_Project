package day4;

    import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChars = 0;
        
        // Convert the string to lowercase to make checking easier
        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
            // Check if the character is a digit
            else if (ch >= '0' && ch <= '9') {
                digits++;
            } 
            // Exclude spaces, treat everything else as a special character
            else if (ch != ' ') {
                specialChars++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits/Numbers: " + digits);
        System.out.println("Special Characters: " + specialChars);
        
        scanner.close();
    }
}

