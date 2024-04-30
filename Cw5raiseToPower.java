import java.util.Scanner;

public class Cw5raiseToPower {

    public static int power(int a, int b){
        int ans = 2;
        for(int i =1; i<b; i++){
            ans=ans*a;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2,5));

//        int a = in.nextInt();
//        int b = in.nextInt();
//        int ans =1;
//        for (int i = 1; i <=b ; i++) {
//            ans = ans *a;
//        }
//        System.out.println(ans);
//        MY APPROACH

     /*   int i =1;
        int ans = a;
        while(i<b){
            ans = ans *a;
            i++;
        }
        System.out.println(ans);
      */
    }
}
