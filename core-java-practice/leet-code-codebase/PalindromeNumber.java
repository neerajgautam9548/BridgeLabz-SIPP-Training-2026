import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int originalNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println(originalNumber + " is a Palindrome Number");
        } else {
            System.out.println(originalNumber + " is not a Palindrome Number");
        }
    }
}