public class SecondSmallest {
    private static int getMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    private static int getSecondMin(int[] arr) {
        int largestMin= getMin(arr);
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==largestMin){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondSmall= getMin(arr);
           return secondSmall;
        }

    public static void main(String[] args) {
        int[] arr= {9,8,9,6,9,5,8,1};
        System.out.println(getSecondMin(arr));
    }


}
