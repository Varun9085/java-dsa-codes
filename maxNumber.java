import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//by math.max func
//        int max = Math.max(c,Math.max(a , b) ) ;
//        System.out.println(max);

        int max = a;
        if(a<b){
            max=b;
        }
        if (b<c) {
            max= c;
        }
        System.out.println(max);
        //by explicitly
    }
}
