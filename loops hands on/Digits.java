import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int n =  in.nextInt();

//                COUNT THE DIGITS
  /*              int i =0;
        while(n>0){
           n/=10;
            i++;
        } */
        //        System.out.println(i-1);

//        for loop version
       /* int i ;
        for (i = 0; n>0 ; i++) {
            n/=10;
        }
        System.out.println(i); */


//        int sum = 0;
//        for (int i = 0; i <=n ; i++) {
//            sum +=n%10;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        for (int i = 1; i <n ; i++) {
//          i*=n;
//          sum =i;
//        }
//        System.out.println(sum);


// FIND THE SUM OF DIGITS
/*        int ans =0;
        while(n>0){
            ans+=n%10;
            n/=10;
        }
        System.out.println(ans);
        */

//        REVERSE THE NUMBER
        int ans = 0;
        while(n>0){
            int last = n%10;
            ans = ans * 10 + last;
            n/=10;
        }
        System.out.println(ans);

    }
}
