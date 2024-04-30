import java.util.Scanner;

public class Cw2_sumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;

        while(n!=0){
            ans+= n%10;
            n= n/10;
        }
        System.out.println(ans);
    }
// SUM OF N NATURAL NUMBERS
    public static int sum(int n){
        return n*(n+1)/2;
    }
}
