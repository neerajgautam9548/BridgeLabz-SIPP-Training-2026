public class MathWizard {

    // Instance variable
    int instanceVar = 100;

    // Check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Factorial using iteration (int)
    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded factorial for double
    public static double factorial(double n) {
        double fact = 1.0;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci Series
    public static void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power(base, exp)
    public static long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Demonstrate scope
    public void showScope() {
        int localVar = 50; // Local variable

        System.out.println("Local Variable    : " + localVar);
        System.out.println("Instance Variable : " + instanceVar);
    }

    public static void main(String[] args) {

        System.out.println("Prime Check (29): " + isPrime(29));

        System.out.println("Factorial (5): " + factorial(5));

        System.out.println("Factorial (5.0): " + factorial(5.0));

        fibonacci(10);

        System.out.println("GCD(24, 36): " + gcd(24, 36));

        System.out.println("LCM(24, 36): " + lcm(24, 36));

        System.out.println("Power(2, 5): " + power(2, 5));

        // Scope demonstration
        MathWizard obj = new MathWizard();
        obj.showScope();
    }
}