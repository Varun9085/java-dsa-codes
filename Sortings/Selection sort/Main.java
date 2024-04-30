import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 63, 4, 53};
        int[] arrw = {7, 4, 5, 1, 2};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void select(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) { // i represents the current index

            //Find the min element in the unsorted array
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            //   swap the found minimum element with the current element
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }
}
