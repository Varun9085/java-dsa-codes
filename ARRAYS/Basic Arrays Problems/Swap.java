public class Swap {
    private static void swap(int a, int b){
        int temp= a;
        a=b;
        b=temp;

    }

    public static void main(String[] args) {
        int a = 9,b = 6;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

    }
}
