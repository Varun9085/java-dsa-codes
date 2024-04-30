public class SecondLargest {

    private static int getSecondMax(int[] arr){
        int max = getMax(arr);
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }



        }
        int ans = getMax(arr);
        return ans;
    }
    private static int getMax(int[] arr){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr= {9,9,6,9,5,7};
        System.out.println(getSecondMax(arr));
    }
}
