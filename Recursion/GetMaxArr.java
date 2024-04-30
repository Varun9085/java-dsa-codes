public class GetMaxArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(getMax(arr,0));
    }
    public static int getMax(int[] arr, int index){
        if(index==arr.length-1) return arr[index];

        int max =getMax(arr,index+1);

        return Math.max(max,arr[index]);

    }
}
