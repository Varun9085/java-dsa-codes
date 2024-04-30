import java.util.Scanner;

public class Q_queries {
    private static int[] freqArr(int[] arr){
        int [] freq = new int[100005];
        for (int i = 0; i <arr.length ; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=0){
            System.out.println("Invalid size! Program Ends!");
            return;
        }
        int[] arr= new int[n];
        System.out.println("Enter the elements til "+ n);

        for(int i=0; i<arr.length; i++){
            System.out.print("Element "+(i+1)+" :");
            arr[i]=in.nextInt();
        }

        int[] freqArr= freqArr(arr);

        System.out.println("Enter number of Q queries");

        int q = in.nextInt();



        while(q>0){
            System.out.println("Enter the Number to be searched : ");
            int num= in.nextInt();
            if(freqArr[num]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }

        System.out.println("PROGRAM ENDS!");


    }

    }


