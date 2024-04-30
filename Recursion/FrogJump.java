public class FrogJump {
    public static void main(String[] args) {
    int[] arr= {10,30,40,20};
        System.out.println(best(arr,0));
    }
    public static int best(int[] h, int idx){
        if(idx==h.length-1){
            return 0;
        }
        int opt1 = Math.abs(h[idx]-h[idx+1]) + best(h,idx+1);
        if(idx==h.length-2){
            return opt1;
        }
        int opt2 = Math.abs(h[idx]-h[idx+2]) + best(h,idx+2);
        return Math.min(opt1,opt2);
    }
}
