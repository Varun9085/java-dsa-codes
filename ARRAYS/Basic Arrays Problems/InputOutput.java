
import java.util.*;


public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Handling edge case: Negative size or zero
        if (size <= 0) {
            System.out.println("Invalid array size. Exiting program.");
            return;
        }

        // Creating the array
        int[] array = new int[size];

        // Taking input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Displaying the array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();



        // Handling edge case: Empty array
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        scanner.close();
    }
}
