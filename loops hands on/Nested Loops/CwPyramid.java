public class CwPyramid {
    public static void main(String[] args) {
//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 1 ; j <=4-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <=2*i-1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <=4 ; i++) {
            for (int j = 4-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k+=2) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
