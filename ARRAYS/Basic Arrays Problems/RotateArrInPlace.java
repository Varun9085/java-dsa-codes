import java.util.Arrays;

public class RotateArrInPlace {
    private static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start] =arr[end];
        arr[end]=temp;
    }
    private static void reverse(int[] arr , int start , int end){

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    private static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr,0, n-k-1);
        reverse(arr, n-k,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));

    }
}
