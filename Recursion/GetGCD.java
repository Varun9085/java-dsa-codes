public class GetGCD {
    public static void main(String[] args) {
        System.out.println(GCDRecursive(24,15));
    }
    //RECURSIVE METHOD

    public static int GCDRecursive(int x, int y){
        if(x%y==0){
            return y;
        }
        return GCDRecursive(y,x%y);
    }
    //ITERATIVE METHOD;

    public static int gcd(int x, int y){
        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;

    }
}
