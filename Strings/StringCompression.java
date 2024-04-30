public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbbccddde";
        compressor(str);

    }
    public static void compressor(String str){
        String ans = ""+ str.charAt(0); // its a hack to solve how char cant be stored in string
        int count = 1;
        for(int i = 1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }else{
                if(count>1) ans+=count; //handling edge case
                count=1;
                ans+=curr;
            }

        }
        if(count>1) ans+=count; //handling edge case
        System.out.println(ans);
    }
}
