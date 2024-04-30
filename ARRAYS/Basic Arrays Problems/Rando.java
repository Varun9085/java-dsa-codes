import java.util.Arrays;

public class Rando {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            int[] arr ={-13,20,7,0,-4,-13,11,-5,-13};
            int[] arr2 ={19,-20,7,-4,-13,11,-5,3};
            twopoint(arr);

            System.out.println(Arrays.toString(arr));
        }
        public static void swap(int[] arr, int st, int end){
            int temp = arr[st];
            arr[st]= arr[end];
            arr[end]=temp;
        }
        public static void twopoint(int[] arr){
            int st = 0;
            int end = arr.length-1;
            while(st<end){
                if(arr[st]>=0 && arr[end]<0){
                    swap(arr,st,end);
                    st++;
                    end--;
                }
                if(arr[st]<0) st++;
                if(arr[end]>0) end--;
            }
        }
         public static void part(int[] arr){
             int st = 0; int end = arr.length-1;
             while(st<end){
                 while(arr[st]<0) st++;
                 while(arr[end]>=0) end--;
                 if(st<end){
                     swap(arr,st,end);
                     st++;
                     end--;
                 }
             }
         }
    }
