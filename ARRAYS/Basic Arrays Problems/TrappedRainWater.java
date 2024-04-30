public class TrappedRainWater {
    public static void main(String[] args) {
        int[] height= {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }

    //SHRADHHA KHAPRA
    /*TIME COPLEXITY : O(n);
    SPACE COMPLEXITY : O(n);*/
    public static int trappedWater(int[] height){
        int trappedWater = 0;
        int n = height.length;
        // CALCULATE LEFT MAXIMUM
        int[] leftMax = new int[n];
        leftMax[0]=height[0];
        for(int i = 1; i<n; i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //CALCULATE RIGHT MAXIMUM
        int[] rightMax= new int[n];
        rightMax[n-1]= height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        for (int i = 0; i <n ; i++) {
            int water= Math.min(leftMax[i],rightMax[i]);
            trappedWater+=water-height[i];
        }
        return trappedWater;
    }

    //CHAT GPT OPTIMAL CODE:
    /*TIME COPLEXITY : O(n);
   SPACE COMPLEXITY : O(1);*/
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}
