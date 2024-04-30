import java.util.Scanner;

public class NumericalTriangle {
    public static void main(String[] args) {
//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        int j = 0;

        for(int i = 1; i<=7; i++){
            for(j =1; j<=7; j++){
                System.out.print(j);

            }


            for(int k =1; k<=7-i; k++){
                System.out.print(i);
            }

            System.out.println();
        }

    }
}
