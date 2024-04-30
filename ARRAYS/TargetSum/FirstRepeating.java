public class FirstRepeating {
    private static int getFirstVal(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
//    public static int getVal(int[] arr){
//        int ans = -1;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i]==arr[j]){
//                    ans = arr[j];
//                    return ans;
//                }
//            }
//
//        }
//        return ans;
//    }
//    public static int getVal(int[] arr) {
//        if (arr == null || arr.length == 0) { // Handle empty or null array
//            return -1;
//        }
//
//        int ans = arr[0];  // Initialize ans with the first element
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {  // Compare with all previous elements
//                if (arr[i] == arr[j]) {
//                    return arr[i];  // Return immediately if a repeating value is found
//                }
//            }
//            // If no match found, update ans with the current element as a potential candidate
//            ans = arr[i];
//        }
//        return -1;  // No repeating value found
//    }
    public static void main(String[] args) {
        int arr[]= {1,5,3,4,6,3,4};
        System.out.println(getFirstVal(arr));
    }

}
