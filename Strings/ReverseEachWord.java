public class ReverseEachWord {
    public static void main(String[] args) {

        String s = "iam online educator";
        reverseEach(s);
    }
    public static void reverseEach(String s){
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                str.append(ch);

            }else{
                str.reverse();
                ans.append(str);
                ans.append(" ");
                str = new StringBuilder();
            }
        }
        str.reverse();
        ans.append(str);
        System.out.println(ans);
    }
}
