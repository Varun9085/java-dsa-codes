import java.util.Arrays;

public class RotateArr {
    private static int[] rotate(int[]arr, int k){
        int n = arr.length;
        k%=n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i<n; i++){
            ans[j++]=arr[i];
        }
        for (int i = 0; i <n-k ; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotate(arr,5)));
    }
}
