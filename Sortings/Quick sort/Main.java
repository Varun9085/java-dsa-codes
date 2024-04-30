import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] arr ={2,3,2,5,3,7,4,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr, int st, int end){
        int temp= arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }
    public static void quickSort(int[] arr, int st, int end){
        if(st>=end) return;
        int pivot = partition(arr,st,end);
        quickSort(arr,st,pivot-1);
        quickSort(arr,pivot+1,end);
    }
    public static int partition(int[] arr, int st, int end){
        int pivot= arr[st];
        int count =0;
        for(int i = st+1; i<=end; i++){
            if(arr[i]<pivot) count++;
        }
        int pivotIndex= st+count;
        swap(arr,st,pivotIndex);
        int i =st; int j= end;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
}