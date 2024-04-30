public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr ={3,4,5,1,2};

        System.out.println(getMinIndex(arr));
    }
    public static int getMinIndex(int[] arr){
        int start = 0, end = arr.length-1, ans =-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<=arr[arr.length-1]){ // You are in 2nd sorted array
                ans = mid;
                end = mid-1;
            }else if(arr[mid]>arr[arr.length-1]){// You are in first sorted array please go
                                                 // to the second one to get minIndex.
                start = mid+1;
            }
        }
        return ans;
    }
}
