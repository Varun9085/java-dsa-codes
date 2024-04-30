public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 11; i++) {
            System.out.println((i) + " exits in array: " + recBS(arr,0,arr.length-1,i));
        }
//        System.out.println(binarySearch(arr,0));
    }

    public static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return false;
    }

    // RECURSIVE APPROACH:
    public static boolean recBS(int[] arr, int st, int end, int target) {
        if (st > end) {
            return false;
        }
        int mid = st + (end - st) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (target < arr[mid]) {
            return recBS(arr, st, mid - 1, target);
        } else {
            return recBS(arr, mid + 1, end, target);

        }
    }
}
