import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        int[] arr = {2,4,5};

        getSSQ(arr,arr.length,0,0);
    }
    public static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
             ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns= getSSQ(s.substring(1));
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    // WITHOUT ARRAYLIST AND OPTIMISED

    public static void getSSQ(String s, String curr){
        if(s.length()==0){
            System.out.println(curr);
            return;
        }
        char currAns = s.charAt(0);

        getSSQ(s.substring(1), curr+currAns);//Add
        getSSQ(s.substring(1), curr);
    }

    // Given an Array of integers. Print sum of all subsets.

    public static void getSSQ(int[] arr,int n,int idx, int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }

        getSSQ(arr,n,idx+1,sum+arr[idx]);//Inclusion
        getSSQ(arr,n,idx+1,sum);//Exclusion
    }

}
