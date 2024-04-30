public class NumberOcurrences {
    public static int getNumber(int[] arr, int n){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(n==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {1,3,34,3,3,2};
        System.out.println(getNumber(arr,6));
    }
}
