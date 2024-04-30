public class firstOccurence {
    public static void main(String[] args) {

    }
    public static int getIndex(int[] arr, int x){
        int start = 0, end = arr.length-1, fo =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==x){
                fo = mid;
                end = mid-1;
            } else if (x<arr[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return fo;
    }

}
