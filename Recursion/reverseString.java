public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverse("nuraV",0));
    }
    public static void rev(String s, int idx){
        if(idx==s.length()){
            return;
        }
        char c = s.charAt(idx);
        rev(s,idx+1);
        System.out.print(c);
    }
    public static String reverse(String s, int idx){
        if(idx==s.length()){
            return"";
        }
        return reverse(s,idx+1)+s.charAt(idx);
    }
}
