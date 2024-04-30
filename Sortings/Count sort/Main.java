import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr ={5,2,3,1,5,2,6,0};
        int[] arr2= {1,4,5,2,2,5};
       countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void basicCountSort(int[] arr){
        int max = getMax(arr);
        int[] count = new int[max+1];
        for(int i = 0;i<arr.length; i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i =0; i<count.length; i++){
            for(int j = 0; j<count[i]; j++){
                arr[k++]= i;
            }
        }
    }
    public static void countSort(int[] arr){
        int n = arr.length;
        int output[] = new int[n];
        int max = getMax(arr);
        int[] count = new int[max+1];
        for(int i = 0;i<arr.length; i++){
            count[arr[i]]++;
        }
        for(int i = 1; i<count.length; i++){
            count[i]+= count[i-1];
        }
        for(int i = n-1; i>=0; i--){
            int idx = count[arr[i]]-1;
            output[idx]= arr[i];
            count[arr[i]]--;
        }
        for(int i = 0; i<n; i++){
            arr[i]=output[i];
        }
    }
}
