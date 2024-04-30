public class SearchTarget {
    public static void main(String[] args) {
        int [] arr = {1,2,34,5,};
        System.out.println(isPresent(arr,5,0));
    }

    public static boolean isPresent(int[] arr, int target, int idx){
        if(idx>=arr.length){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        return isPresent(arr,target,idx+1);

    }
    public static void indices(int[] arr, int target, int idx){
        if(idx>=arr.length){
            return;
        }

        int j = arr.length;
        int[] array = new int[j];

        if(arr[idx]==target){
            array[j]=idx;
            j++;
        }
       indices(arr,target,idx+1);
    }
}
