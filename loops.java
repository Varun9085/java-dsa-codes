import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//       int num = in.nextInt();
//       int count= 0;
//
//        for (int i = 1; i <=10 ; i++) {
//            count =num*i;
//            System.out.println( num + " x " + i + " = " + count);
        Scanner in =  new Scanner(System.in);
        int num = in.nextInt();

        int count= 0;

        for(int i = 1 ; i<= 10; i++){
            count=num*i;
            System.out.println( num + " x " + i + "=" + count);
        }


        }
    }

