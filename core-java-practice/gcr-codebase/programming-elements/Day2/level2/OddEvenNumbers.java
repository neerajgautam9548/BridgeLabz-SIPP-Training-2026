import java.util.*;

public class OddEvenNumbers {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++)
                System.out.println(i + (i % 2 == 0 ? " Even" : " Odd"));
        }
    }
}