import java.util.Arrays;
import java.util.Scanner;

public class QqueriesSum {
    public static int[] prefixInPlace(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // Start from index 0 to correctly calculate the prefix sum
            if (i > 0) {
                arr[i] += arr[i - 1] ;// Add previous prefix sum
            }
        }
        return arr;
    }

//    public static int queriesSum(int[] arr,int l, int r){
//
////        int sum=0;
////        prefixInPlace(arr);
////
////        for (int i = 1; i <=arr.length ; i++) {
////        sum=arr[r]-arr[l-1];
////        }
////        return sum;
//            // Adjust for 1-based indexing:
////            l--;  // Decrement l to match 0-based indexing
////            r--;  // Decrement r to match 0-based indexing
////
////            // Calculate the sum directly using prefix sums:
////            // Subtract the prefix sum at l-1 (index before the range)
////            // from the prefix sum at r (end of the range)
////            return arr[r] - (l > 0 ? arr[l - 1] : 0); // Handle cases where l is 1
//        l--;  // Adjust for 1-based indexing
//        r--;  // Adjust for 1-based indexing
//
//        // Handle edge case where l is 1:
//        if (l == 0) {
//            return arr[r]; // If l is 1, subtract 0 (no elements before l)
//        }
//
//        return arr[r] - arr[l - 1]; // General case
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array");

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        int[] pref = prefixInPlace(arr);
        System.out.println("The prefix array of main array is: ");
        System.out.println(Arrays.toString(pref));
        System.out.println("Enter Q queries");
        int q = in.nextInt();
        while(q-- > 0){
            System.out.println("Enter the range starting by L");
            int l = in.nextInt();
            System.out.println("Enter the range ending by R");
            int r = in.nextInt();

            int ans = l==0 ? pref[r] :pref[r]-pref[l-1];
            System.out.println(ans);
        }

        
    }
}
