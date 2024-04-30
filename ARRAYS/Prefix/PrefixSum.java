import java.util.Arrays;

public class PrefixSum {
    public static int[] prefix(int[] arr){

        int[] pref = new int[arr.length];
        pref[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }

    public static void prefixSum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                arr[i] += arr[i - 1]; // Add previous prefix sum
            }
        }
    }

    public static void suffixSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            arr[i] = sum;
        }
    }




    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(sum(n));

        int[] arr = {1,2,3,4,5};

        suffixSum(arr);
        System.out.println(Arrays.toString(arr));

    }
}
