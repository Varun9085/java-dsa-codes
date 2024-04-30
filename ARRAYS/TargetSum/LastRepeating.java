public class LastRepeating {
    private static int getLastVal(int[] arr) {
        int ans= -1;
        if(arr.length==0 | arr==null){
            return-1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    ans=arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {1,5,3,4,6,3,4};
        System.out.println(getLastVal(arr));
    }


}
