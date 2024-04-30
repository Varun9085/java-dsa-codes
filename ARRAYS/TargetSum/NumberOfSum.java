import java.util.Arrays;

public class NumberOfSum {
    private static int getNoOfSum(int[] arr, int target) {
        int count = 0;
        for(int i= 0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[] getDig(int[] arr, int x){
        int n = arr.length;
        int[] ans = new int[n];
        int k = 0;
        for(int i =0; i<n-1; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i]+arr[j]==x){
                    ans[k++]=arr[i];
                    ans[k++]= arr[j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,6,3,5,8,2};
        System.out.println(getNoOfSum(arr,7));
       int[] ans= getDig(arr,7);
        System.out.println(Arrays.toString(ans));

    }


}

