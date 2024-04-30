import java.util.Arrays;

public class SortInSquares {


    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sortAscending(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]>arr[j]){
                   swap(arr,i,j);
                }

            }
        }
    }
    public static void sortSquare(int[] arr){
//        sortAscending(arr);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]*=arr[i];
        }
        sortAscending(arr);
    }

    public static int[] sortSquareInPlace(int[] arr){
        int n = arr.length;
        int leftIndex = 0, rightIndex=n-1;
        int[] ans = new int[n];
        int j = 0;
        while(leftIndex<=rightIndex){
            if(Math.abs(arr[leftIndex])>Math.abs(arr[rightIndex])){
                ans[j++]= arr[leftIndex]*arr[leftIndex];
                leftIndex++;
            }else{
                ans[j++]=arr[rightIndex]*arr[rightIndex];
                rightIndex--;
            }
        }



        return ans;

    }
    public static void main(String[] args) {
        int[] arr= {-10,-3,-2,1,4,5};
        sortSquareInPlace(arr);
        
        System.out.println(Arrays.toString(sortSquareInPlace(arr)));
    }
}
