public class IsSortedRec {
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9,12};
        System.out.println(sort(arr,0));
    }
//    public static int (int[] arr, int idx){
//        if(idx==arr.length-1){
//            return arr[idx];
//        }
//        if(arr[idx]<isSorted(arr,idx+1)){
//
//
//        }
//        return
//    }
    public static boolean sort(int[] arr, int firstIndex, int secondIndex) {
        if (secondIndex == arr.length) {
            return true;
        }
        if (arr[firstIndex] > arr[secondIndex]) {
            return false;
        }
       return sort(arr, firstIndex + 1, secondIndex + 1);

    }
    public static boolean sort(int[] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        return arr[idx]<arr[idx+1] && sort(arr,idx+1);
    }
}
