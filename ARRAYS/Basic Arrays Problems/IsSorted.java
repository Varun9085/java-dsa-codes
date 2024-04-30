public class IsSorted {
    public static boolean isSorted(int[] arr){
        boolean ans = true;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<=arr[i-1]){
                ans=false;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,5,4};
        System.out.println(isSorted(arr));
    }
}
