import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,63,4,53};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i<n; i++){
            for(int j=i; j<n; j++){
                while(j>0 && arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                    j--;
                }
            }
        }
    }
}
