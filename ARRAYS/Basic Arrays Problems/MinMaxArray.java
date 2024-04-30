import java.util.Arrays;

public class MinMaxArray {
    public static int[] minMax(int[] arr){
        int max = arr[0]; //assuming that 0th index is max
        int min = arr[0]; //assuming that 0th index is min

        for (int i = 1; i <arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }else if(min>arr[i]){
                min=arr[i];
            }
        }
        int [] ans = {max, min};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {12,34,53,2};
        System.out.println(Arrays.toString(minMax(arr)));
    }
}
