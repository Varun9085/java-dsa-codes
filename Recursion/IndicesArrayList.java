import java.util.ArrayList;

public class IndicesArrayList {
    public static void main(String[] args) {
        int[] arr= {4,4,3,4};
        System.out.println(countTarget(arr,4,0));
    }
    public static ArrayList<Integer> getIndices(int[] arr, int target, int idx){
        if(idx==arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx]==target){
            ans.add(idx);
        }
        ans.addAll(getIndices(arr,target,idx+1)) ;
        return ans;
    }
    public static ArrayList<Integer> countTarget(int[] arr, int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
       list.addAll(countTarget(arr,target,idx+1));
        return list;
    }

}
