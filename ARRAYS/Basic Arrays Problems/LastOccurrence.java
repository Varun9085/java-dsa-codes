public class LastOccurrence {

    public static int getLastIndex(int[] arr, int x){
        int count = 0;
        int ans =0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==x){
                count = count*10+i;
            }
            ans = count%10;
        }
       return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,3,1,4};
        System.out.println(getLastIndex(arr,1));
    }
}
