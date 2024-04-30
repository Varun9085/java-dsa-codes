public class PartitionEqualSum {
    public static void main(String[] args) {
        int[] arr= {5,3,2,6,3,1};
        System.out.println((isEquaL(arr)));
    }
    public static int totalSum(int[] arr){
        int sum = 0;
        for(int i= 0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean isEquaL(int[] arr){
        int sum = totalSum(arr);
        int preffix=0;
        for(int i = 0; i<arr.length; i++){
            preffix+=arr[i];
            int suffix= sum-preffix;
            if(preffix==suffix){
                return true;
            }
        }
        return false;
    }

}
