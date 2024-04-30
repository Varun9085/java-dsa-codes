import java.util.Scanner;

public class Program1 {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the triangle's height: ");
            int height = scanner.nextInt();

            // Loop through each row of the triangle
            for (int i = height; i >= 1; i--) {
                // Print the required number of asterisks in each row
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); // M
            }

        }
    }


