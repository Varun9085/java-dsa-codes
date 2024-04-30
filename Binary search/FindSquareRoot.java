public class FindSquareRoot {
    public static void main(String[] args) {
        System.out.println(bin(24));
    }
    public static int bin(int x){
        int start = 0, end = x, ans =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid==x){
                return mid;
            }else  if( mid*mid<=x){
                ans=mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
