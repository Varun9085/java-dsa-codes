import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr ={43,453, 626, 894, 0 ,3};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int getMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static void countSort(int[] arr, int place) { // DATE- 9 MARCH
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < n; i++) { // Store the count of each element
            count[(arr[i] / place) % 10]++;
        }
        for (int i = 1; i < count.length; i++) { // prefix sum
            count[i] += count[i - 1];
        }
        // Find the index of each element of the original arr in count arr, and place the elements in output arr
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void radixSort(int [] arr){
        int max = getMax(arr);
        for(int place = 1; max/place>0; place*=10 ){
            countSort(arr,place);
        }
    }
}
