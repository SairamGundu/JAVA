import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nMultiplication Tables Side by Side:\n");

        // Printing table header
        System.out.printf("%-15s %-15s%n", "Table of " + num1, "Table of " + num2);
        System.out.println("-----------------------------------");

        // Printing tables side by side
        for (int i = 1; i <= 10; i++) {
            System.out.printf( (num1 + " x " + i + " = " + (num1 * i)), 
                                                (num2 + " x " + i + " = " + (num2 * i)));
        }

        scanner.close();
    }
}
