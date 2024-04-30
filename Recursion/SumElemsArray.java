public class SumElemsArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,3,4};
        System.out.println(sumArray(arr,0));
    }

    public static int sumArray(int[] arr, int index){
        if(index==arr.length-1){
            return arr[index];
        }
        return sumArray(arr, index+1)+arr[index];
    }
}
