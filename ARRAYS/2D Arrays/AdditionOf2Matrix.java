import java.util.Scanner;

public class AdditionOf2Matrix {
    static void printMatrix(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void addMatrix(int[][] matrix1, int r1, int c1, int[][] matrix2, int r2, int c2 ){
        if(r1!=r2 | c1!=c2){
            System.out.println("Unable to generate the output due to invalid input ");
            return;
        }
        int[][] sum = new int[r1][c1];

        for(int i =0; i<r1; i++){
            for (int j = 0; j <c1 ; j++) {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row1,col1,row2,col2;
        while(true){
            System.out.println("Enter number of rows: ");
            row1=in.nextInt();
            if(row1>0){
                break;
            }
            System.out.println("Invalid Input! Kindly input positive integers");
        }

        while(true){
            System.out.println("Enter number of cols: ");
            col1=in.nextInt();
            if(col1>0){
                break;
            }
            System.out.println("Invalid Input! Kindly input positive integers");
        }
        int[][] matrix1 = new int[row1][col1];

        System.out.println("Enter number of elements for matrix1");
        for(int i =0; i<row1; i++){
            for (int j = 0; j <col1 ; j++) {
                matrix1[i][j]=in.nextInt();
            }
        }
        while(true){
            System.out.println("Enter number of rows: ");
            row2=in.nextInt();
            if(row2>0){
                break;
            }
            System.out.println("Invalid Input! Kindly input positive integers");
        }

        while(true){
            System.out.println("Enter number of cols: ");
            col2=in.nextInt();
            if(col2>0){
                break;
            }
            System.out.println("Invalid Input! Kindly input positive integers");
        }

        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter number of elements for matrix2");
        for(int i =0; i<row2; i++){
            for (int j = 0; j <col2 ; j++) {
                matrix2[i][j]=in.nextInt();
            }
        }

        System.out.println("matrix1:");
        printMatrix(matrix1);
        System.out.println("matrix2:");
        printMatrix(matrix2);

        System.out.println("Product of 2 Matrices: ");
        addMatrix(matrix1,row1,col1,matrix2,row2,col2);
    }
}
