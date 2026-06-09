import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int reverse = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (number < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed Integer = " + reverse);

        sc.close();
    }
}