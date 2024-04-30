import java.util.Arrays;

public class index {
     public static void main(String[] args) {
        int[] arr = {5,3,6,2,9,1};
        bestBub(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bub(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void bestBub(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            boolean flag= false;
            for(int j = 0; j<n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
                if(!flag){
                    return;
                }
            }
        }
    }

