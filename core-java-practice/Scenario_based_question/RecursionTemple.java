public class RecursionTemple {

    static int moveCount = 0;

    // Tower of Hanoi
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " -> " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from " + source + " -> " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    // Recursive Binary Search
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == key)
            return mid;

        if (key < arr[mid])
            return binarySearch(arr, left, mid - 1, key);

        return binarySearch(arr, mid + 1, right, key);
    }

    // Sum of Digits
    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }

    // Reverse String
    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Check Balanced Parentheses Without Stack
    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    private static boolean checkBalance(String str, int index, int count) {

        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        char ch = str.charAt(index);

        if (ch == '(')
            return checkBalance(str, index + 1, count + 1);

        if (ch == ')')
            return checkBalance(str, index + 1, count - 1);

        return checkBalance(str, index + 1, count);
    }

    public static void main(String[] args) {

        // Tower of Hanoi
        int n = 3;

        System.out.println("=== Tower of Hanoi ===");
        towerOfHanoi(n, 'A', 'B', 'C');

        System.out.println("Total Moves = " + moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500, 600};

        int key = 400;
        int index = binarySearch(prices, 0, prices.length - 1, key);

        System.out.println("\nBinary Search:");
        System.out.println("Price " + key + " found at index: " + index);

        // Sum of Digits
        int number = 9876;
        System.out.println("\nSum of Digits of " + number + " = "
                + sumOfDigits(number));

        // Reverse String
        String message = "Temple";
        System.out.println("\nOriginal String: " + message);
        System.out.println("Reversed String: " + reverseString(message));

        // Balanced Parentheses
        String expression = "((())())";

        System.out.println("\nExpression: " + expression);

        if (isBalanced(expression))
            System.out.println("Balanced Parentheses");
        else
            System.out.println("Not Balanced");
    }
}