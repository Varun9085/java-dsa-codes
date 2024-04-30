import java.util.Scanner;

public class Cw3reverseTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans  = 0;


        while(n!=0){
           ans = ans *10 + n%10;
           n/=10;
        }
        System.out.println(ans);
    }
}
