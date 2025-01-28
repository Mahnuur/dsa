import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two floating-point numbers
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        // Truncate to three decimal places
        num1 = Math.floor(num1 * 1000) / 1000;
        num2 = Math.floor(num2 * 1000) / 1000;

        // Compare the truncated values
        if (num1 == num2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        scanner.close();
    }
}
