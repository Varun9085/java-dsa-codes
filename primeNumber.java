import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
//        for (int i = 2; i <=n ; i++) {
//            if (n%2==0) {
//                System.out.println(n + " is not a Prime number ");
//                break;
//            }else {
//                System.out.println(n + " is Prime number ");
//                break;
//            }
//        }


    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c =  2;
        while(c*c<=n){
            if(c%n==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
