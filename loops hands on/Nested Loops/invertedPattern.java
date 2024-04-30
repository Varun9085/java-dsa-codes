public class invertedPattern {
    public static void main(String[] args) {
        int n =4;
        //        for(int i =1; i<=n; i++){
//            for(int j =1 ; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k = 1; k<=i; k++){
//                System.out.print("+");
//            }
//
//            System.out.println();
//        }
//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 4-i; j >0 ; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <=i ; k++) {
//                System.out.print("+");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <=i-1 ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("+");
            }


            System.out.println();
        }

    }
}
