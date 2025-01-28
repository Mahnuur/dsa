public class ArrayCalculations {
    public static void main(String[] args) {
        // Define the bounds for the arrays
        int lowerBoundAAA = 5;
        int upperBoundAAA = 50;

        int lowerBoundBBB = -5;
        int upperBoundBBB = 10;

        int lowerBoundCCC = 1; // Assuming it starts at 1
        int upperBoundCCC = 18;

        // Calculate the number of elements in each array
        int numElementsAAA = calculateNumberOfElements(lowerBoundAAA, upperBoundAAA);
        int numElementsBBB = calculateNumberOfElements(lowerBoundBBB, upperBoundBBB);
        int numElementsCCC = calculateNumberOfElements(lowerBoundCCC, upperBoundCCC);

        // Print the number of elements
        System.out.println("Number of elements in AAA: " + numElementsAAA);
        System.out.println("Number of elements in BBB: " + numElementsBBB);
        System.out.println("Number of elements in CCC: " + numElementsCCC);

        // Given values
        int baseAAA = 300; // Base address of AAA
        int w = 4; // Assuming each element occupies 4 bytes

        // Calculate and print the addresses
        System.out.println("Address of AAA[15]: " + calculateAddress(baseAAA, lowerBoundAAA, 15, w));
        System.out.println("Address of AAA[35]: " + calculateAddress(baseAAA, lowerBoundAAA, 35, w));
        System.out.println("Address of AAA[55]: " + calculateAddress(baseAAA, lowerBoundAAA, 55, w));
    }

    // Method to calculate the number of elements in an array
    private static int calculateNumberOfElements(int lowerBound, int upperBound) {
        return upperBound - lowerBound + 1;
    }

    // Method to calculate the address of an element in an array
    private static int calculateAddress(int base, int lowerBound, int index, int w) {
        if (index < lowerBound || index > (lowerBound + calculateNumberOfElements(lowerBound, Integer.MAX_VALUE) - 1)) {
            return -1; // Out of bounds
        }
        return base + (index - lowerBound) * w;
    }
}
