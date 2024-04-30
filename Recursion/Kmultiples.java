public class Kmultiples {
    public static void main(String[] args) {
        int n = 3;
        int k = 8;
        printMultiplesCW(n, k);
    }

        // Print the K multiples of n using a loop
//        for (int i = 1; i <= k; i++) {
//            System.out.print(mul(n, i) + " ");
//        }
//    }

    public static int mul(int num, int k) {
        if (k == 1) {
            return num;  // Base condition: return the first multiple
        } else {
            return mul(num, k - 1) + num;  // Recurrence relation: add num to the previous multiple
        }
    }
    public static void printMultiplesCW(int num,int k){
        if(k<1) return;

        printMultiplesCW(num,k-1);
        System.out.println(num*k);

    }
}
