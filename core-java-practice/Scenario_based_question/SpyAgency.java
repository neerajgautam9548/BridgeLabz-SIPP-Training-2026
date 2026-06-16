import java.util.HashMap;
import java.util.Scanner;

public class SpyAgency {

    // Method to find first non-repeating character
    public static char firstNonRepeating(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (freq.get(ch) == 1) {
                return ch;
            }
        }

        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret Message
        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        // Reverse Message
        String reversed = new StringBuilder(message).reverse().toString();
        System.out.println("Reversed Message: " + reversed);

        // Palindrome Check
        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Message is a Palindrome.");
        } else {
            System.out.println("Message is NOT a Palindrome.");
        }

        // Count Vowels and Consonants
        int vowels = 0, consonants = 0;

        for (char ch : message.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Anagram Check
        System.out.print("\nEnter first intercepted message: ");
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second intercepted message: ");
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams.");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            java.util.Arrays.sort(arr1);
            java.util.Arrays.sort(arr2);

            if (java.util.Arrays.equals(arr1, arr2)) {
                System.out.println("The messages are Anagrams.");
            } else {
                System.out.println("The messages are NOT Anagrams.");
            }
        }

        // First Non-Repeating Character
        System.out.print("\nEnter surveillance log: ");
        String log = sc.nextLine();

        char result = firstNonRepeating(log);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found.");
        }

        sc.close();
    }
}