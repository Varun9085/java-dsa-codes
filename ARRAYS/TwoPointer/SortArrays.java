import java.util.Arrays;

public class SortArrays {
    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
