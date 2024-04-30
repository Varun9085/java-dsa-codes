public class NonRepeating {
    static int firstNonRepeating(int arr[])
    {
        //write your logic here
        for(int i = 0 ; i < arr.length; i++){
            int counter = 0;
            for(int j = 0 ;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    counter += 1;

                }
            }
            if(counter == 1){
                return arr[i];
            }
        }
        return 0;
    }
// CHATGPT SLIGHT EFFICIENT THAN ABOVE because it returns immediately when it finds the first non-repeating element,
// while your approach continues looping through the array even after finding the first non-repeating element.
    public static int findFirstNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        System.out.println(firstNonRepeating(arr));
    }
}
