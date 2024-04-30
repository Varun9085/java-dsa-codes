public class Fibonacci {
    public static void main(String[] args) {
//        int n= 10;
//        for (int i = 0; i <n ; i++) {
//            System.out.println(fibo(n));
//
//        }
//        System.out.println(fibo(9));
        rev("varun",0);
    }
    public static int fibo(int n){
        if(n==0 | n==1) return n;
        return fibo(n-1)+fibo(n-2);
    }
//    public static void fibo(int n){
//        if(n==0 | n==1){
//            System.out.println(n);
//        }
//        System.out.println((n-1)+(n-2));
//
//    }
//    public static int fibonacci(int n){
//        int fibo = 0;
//        if(n==0 | n==1) return 1;
//        for(int i = 2; i<=n; i++){
//            fibo = (i-1)+(i-2);
//        }
//        return fibo;
//    }



    public static void rev(String s, int idx){
        if(idx==s.length()) return;

        rev(s,idx+1);
        System.out.print(s.charAt(idx));
    }
}
