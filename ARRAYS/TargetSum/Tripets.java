public class Tripets {
    public static int numberOfTriplets(int[] arr, int target){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        System.out.println(numberOfTriplets(arr,12));
    }
}

