public class SubArrays {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10};
        subArrays(arr);

    }
    public static int sumOfDigits(int n){
        if(n<10){
            return n;
        }
        return sumOfDigits(n/10)+n%10;
    }
    public static void subArrays(int[] arr){
        int i,j,k,l;
        int sum =0;
        int n = arr.length;
        for( i = 0; i<n; i++){
            for(j = i; j<n; j++){
                for( k = i; k<=j; k++){
                    System.out.print(arr[k]);
//                  

                }

                System.out.println();
            }

            System.out.println();
        }
    }
}
