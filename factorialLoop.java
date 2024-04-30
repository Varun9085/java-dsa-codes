import java.util.Scanner;

public class factorialLoop {
    public static void main(String[] args) {
//        int num; // To hold number
//        int fact = 1; // To hold factorial
//
//        System.out.print("Enter any positive integer: ");
//        num = console.nextInt();
//
//        for(int i=1; i<=num; i++)
//        {
//            fact *= i;
//        }

        Scanner in  = new Scanner(System.in);
        int n =  in.nextInt();
        int count= 1;
        for (int i = 1; i <=n ; i++) {
            count *= i;

        }
        System.out.println(count);



    }
}
