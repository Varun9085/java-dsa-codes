public class DistruibuteChocolates {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


        public static void main(String[] args) {
            int[] arr= {12,34,67,90};
            int m = 2;

            System.out.println(distChoc(arr,m));
        }
        public static int distChoc(int[] arr, int m){
            int st = 1, end = (int) 1e9;
            int ans = 0;
            while(st<=end){
                int mid = st+(end-st)/2;
                if(divPossible(arr,m,mid)){
                    ans = mid;
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }
            return ans;
        }
        public static boolean divPossible(int[] arr, int m , int maxAllowed){
            int students= 1;
            int choc =0;
            for(int i = 0; i<arr.length; i++){
                if(arr[i]>maxAllowed) return false;
                if(choc+arr[i]<=maxAllowed){
                    choc+=arr[i];
                }else{
                    students++;
                    choc= arr[i];
                }
            }
            if(students>m) return false;
            return true;
        }
    }

