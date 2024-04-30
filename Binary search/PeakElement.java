public class PeakElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1};
        System.out.println(peakElement(arr));
    }
    public static int peakElement(int[] arr){
        int start= 0, end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) &&(mid==arr.length-1 || arr[mid]>arr[mid+1])){
                return mid;
            }
            if(arr[mid]<arr[mid+1]){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }
}
