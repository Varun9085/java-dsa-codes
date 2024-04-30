import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        int b  = in.nextInt();
        int c  = in.nextInt();
        System.out.println(min(a,b,c) );

    }

 public static int min(int a, int b, int c) {
        int min =a;
        if(min>b){
             min=b;
        }else if(min>c){
            min=c;
        }
     return min;
    }

}
