
import java.util.Scanner;

public class My2DArrayExample { // Corrected class name

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int[][] matrix1, int r1, int c1, int[][] matrix2, int r2, int c2){
        if(r1!=r2 | c1!=c2){
            System.out.println("Invalid");
            return;

        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i <r1 ; i++) {
            for(int j =0; j<c1;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }

        }
        printArray(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows;
        int cols;
        int rows2;
        int cols2;

        // Input with validation
        while (true) {
            System.out.println("Enter number of rows (positive integer): ");
            rows = in.nextInt();
            if (rows > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        while (true) {
            System.out.println("Enter number of columns (positive integer): ");
             cols = in.nextInt();
            if (cols > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive integer.");
        }

        int[][] arr = new int[rows][cols];

        // Input with clearer instructions
        System.out.println("Enter elements row by row, separated by spaces:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        while (true) {
            System.out.println("Enter number of rows (positive integer): ");
            rows2 = in.nextInt();
            if (rows2 > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        while (true) {
            System.out.println("Enter number of columns (positive integer): ");
            cols2 = in.nextInt();
            if (cols2 > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive integer.");
        }

        int[][] arr2 = new int[rows2][cols2];

        // Input with clearer instructions
        System.out.println("Enter elements row by row, separated by spaces:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        // Print the array
        System.out.println("Entered array of Matrix1:");
        printArray(arr);
        System.out.println("Entered array of Matrix2: ");
        printArray(arr2);
        System.out.println("after addition");
        add(arr,rows,cols,arr2,rows2,cols2);
    }
}

