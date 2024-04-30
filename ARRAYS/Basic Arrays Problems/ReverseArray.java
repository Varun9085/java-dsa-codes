import java.util.Arrays;

public class ReverseArray {

//    BY CW
        private static int[] reverseArr(int[] arr){
            int[] ans = new int[arr.length];
            int j = 0;
            for (int i = arr.length-1; i >=0 ; i--) {
                ans[j++]= arr[i];
            }
            return ans;
        }

        // By KK
    private static void swap(int[] arr , int index1 , int index2){
            int temp = arr[index1];
            arr[index1]= arr[index2];
            arr[index2]= temp;
    }
    private static void reverseArray(int[] arr){
            int start = 0;
            int end = arr.length-1;
            while(start<end){
                swap(arr,start, end);
                start++;
                end--;
            }

    }
    public static void main(String[] args) {
            int[] arr ={1,2,3,4};
            reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
