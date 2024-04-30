import java.util.Arrays;

public class SortEvens {
    public static void swap(int[] arr, int first , int last){
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    public static void sortEvenly(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        sortEvenly(arr);
        System.out.println(Arrays.toString(arr));
    }
}
