import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt(); // User inputs the number of rows for the diamond

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print increasing part of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + j);
            }

            // Print decreasing part of the pattern
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("*" + j);
            }

            System.out.println(); // Move to the next line after each row
        }

        // Lower half of the diamond (excluding the middle row)
        for (int i = n - 1; i >= 1; i--) {
            // Print increasing part of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + j);
            }

            // Print decreasing part of the pattern
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("*" + j);
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}