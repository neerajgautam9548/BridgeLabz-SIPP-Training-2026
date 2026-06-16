import java.util.HashSet;
import java.util.Scanner;

public class WarehouseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stock quantities
        int[] stock = {50, 20, 30, 20, 70, 50, 90};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        // Find max, min, total
        for (int qty : stock) {
            if (qty > max)
                max = qty;
            if (qty < min)
                min = qty;
            total += qty;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);

        // Detect duplicates
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int qty : stock) {
            if (!seen.add(qty)) {
                duplicates.add(qty);
            }
        }

        System.out.println("Duplicate Quantities: " + duplicates);

        // Rotate array by k positions
        System.out.print("\nEnter value of k for rotation: ");
        int k = sc.nextInt();

        k = k % stock.length;
        int[] rotated = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            rotated[(i + k) % stock.length] = stock[i];
        }

        System.out.print("Rotated Stock Array: ");
        for (int item : rotated) {
            System.out.print(item + " ");
        }

        // 2D Shelf Grid
        int[][] shelf = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n\nOriginal Shelf Grid:");
        for (int[] row : shelf) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Transpose
        int rows = shelf.length;
        int cols = shelf[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        System.out.println("\nTransposed Shelf Grid:");
        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}