public class Cw_oneTwoPattern {
    public static void main(String[] args) {
        for (int r = 1; r <=6 ; r++) {
            for (int c = 1; c <=6 ; c++) {
                if ((r+c)%2==0){
                    System.out.print(1);
                }else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
