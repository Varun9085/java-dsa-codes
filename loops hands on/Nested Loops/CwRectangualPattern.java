public class CwRectangualPattern {
    public static void main(String[] args) {
//        for (int i = 1; i <=3 ; i++) {
//            for (int j = 1; j <=6 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        rect(3);
    }
    public static void rect(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
