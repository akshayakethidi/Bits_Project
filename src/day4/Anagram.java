package day4;
    import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Result: The strings are anagrams.");
        } else {
            System.out.println("Result: The strings are NOT anagrams.");
        }

        scanner.close();
    }

    public static boolean isAnagram(String s1, String s2) {
        // 1. Remove all whitespaces and convert to lowercase
        // This handles phrases like "debit card" and "bad credit"
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // 2. If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // 3. Convert strings to character arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // 4. Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // 5. If the sorted arrays are equal, it's an anagram
        return Arrays.equals(charArray1, charArray2);
    }
}

