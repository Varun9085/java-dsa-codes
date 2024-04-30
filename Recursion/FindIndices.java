public class FindIndices {
    public static void main(String[] args) {
        int[] arr= {1,2,3,2,2,5};
        System.out.println("Hello, World!");
        getIndices(arr,2,0);
    }
    public static void getIndices(int[] arr, int x, int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==x){
            System.out.println(idx);
        }
        getIndices(arr,x,idx+1);
    
    }
}
