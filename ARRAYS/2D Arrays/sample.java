import java.util.Arrays;

class sample{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] b = arr;
        arr[0]=99;
        int a = 12;
        int b2 = a;
        a=4;
        System.out.println(a);
        System.out.println(b2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(b));
    }
}
