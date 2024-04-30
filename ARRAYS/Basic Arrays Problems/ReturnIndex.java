import java.util.Arrays;

public class ReturnIndex {

    public static int getIndex(int[] arr, int index){

        for (int i = 0; i <arr.length ; i++) {

            if(index==arr[i]){
                return index=i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(getIndex(arr,5));
    }
}
