public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr ={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60,}
        };
        System.out.println(search2d(arr,3));
    }
    public static boolean search(int[][] arr, int target){
        int n = arr.length, m = arr[0].length;
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int midElement= arr[mid/m][mid%m];
            if(midElement==target){
                return true;
            }
            if (target<midElement){
                end = mid-1;
            }else{
                start =mid+1;
            }
        }
        return false;
    }

    public static boolean search2d(int[][] arr, int target){
        int n = arr.length, m= arr[0].length;
        int i =0, j = m-1;
        while(i<n && j>=0){
            if(arr[i][j]==target){
                return true;
            }
            if(target<arr[i][j]){
                j--; //Move left
            }else{
                i++; // Move right.
            }
        }
        return true;
    }
}
