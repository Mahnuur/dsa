import java.util.Scanner;

public class NumberOrder {

    // Method to determine the order of the numbers
    public static String determineOrder(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3) {
            return "increasing";
        } else if (num1 > num2 && num2 > num3) {
            return "decreasing";
        } else {
            return "Neither increasing nor decreasing order";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Determine the order
        String result = determineOrder(num1, num2, num3);

        // Print the result
        System.out.println("The numbers are in " + result + ".");

        scanner.close();
    }
}


