public class PrimeNumber {
    public static void main(String[] args) {

    }
    //ITERATIVE
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If n is divisible by any number up to its square root, it's not prime
            }
        }
        return true; // If no divisor is found, n is prime
    }
    // RECURSIVE
    public static void prime(int n , int c){
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        if(c==n){
            System.out.println("Prime");
            return;
        }

        if(n%c==0){
            System.out.println("Not Prime");
            return;
        }
        prime(n,c+1);
    }
}
