import java.util.Scanner;

public class CwNumericalPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
//        }

//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int ans = 1;
//        for (int i = 1; i <num ; i++) {
//            ans+= i*ans;
//        }
//        System.out.println(ans);
//    }

