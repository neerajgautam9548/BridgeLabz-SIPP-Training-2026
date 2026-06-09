import java.util.Scanner;
import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = roman.get(s.charAt(i));

            if (i < s.length() - 1) {
                int next = roman.get(s.charAt(i + 1));

                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String romanNumber = input.nextLine();

        int integerValue = romanToInt(romanNumber);

        System.out.println("Integer Value = " + integerValue);
    }
}