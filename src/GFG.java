import java.io.*;

class GFG {
    // Function to insert an element at a specific position
    static void insertElement(int arr[], int n, int x, int pos) {




        // Shift elements to the right, starting from the last element
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the new element at the specified position
        arr[pos] = x;
    }

    public static void main(String[] args) {
        // Initialize the array and variables
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int n = 5;  // Current size of the array
        int x = 10, pos = 2;  // Element to insert and position

        // Print the array before insertion
        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insert element at the specified position
        insertElement(arr, n, x, pos);
        n++;  // Increase the size of the array after insertion

        // Print the array after insertion
        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

