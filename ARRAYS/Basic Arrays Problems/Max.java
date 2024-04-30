public class Max {
    public static int maxValue(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                return max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {23,23,43,4};
        System.out.println(maxValue(arr));

    }
}
