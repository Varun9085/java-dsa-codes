import java.util.Arrays;

public class SortLexically {
    public static void main(String[] args) {
        String[] fruits={ "Kiwi", "Apple","papaya","mango"};
        sortLex(fruits);
        System.out.println(Arrays.toString(fruits));
    }
    public static void sortLex(String[] fruits){
        int n = fruits.length;
        for (int i = 0; i <n-1; i++) {
            int minIndex=i;
            for (int j = i+1; j <n ; j++) {
                if(fruits[j].compareTo(fruits[minIndex])<0){
                    minIndex=j;
                }
                String temp = fruits[i];
                fruits[i]=fruits[minIndex];
                fruits[minIndex]=temp;
            }

        }
    }
}
