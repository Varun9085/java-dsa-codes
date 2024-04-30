import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class OnlyRepeatedNumber {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findRepeatedNumber(arr, n);

        System.out.println(result);
    }
    public static int findRepeatedNumber(int[] arr, int n) {
        int ans = 0;
        for(int i =0;i<n;i++){
            for(int j = i+1; j<n;j++){
                if(arr[i] ==arr[j]){
                    ans= arr[i];
                }
            }
        }
        return ans;
    }
}

