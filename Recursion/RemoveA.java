public class RemoveA {
    public static void main(String[] args) {
        System.out.println(remove2("abcda"));
    }
    public static String remove(String s, int idx){
        if(idx==s.length()) return "";
        String smallAns = remove(s,idx+1);
        char currValue = s.charAt(idx);
        if(currValue!='a'){
            return currValue+smallAns;
        }else{
            return smallAns;
        }
    }
    public static String remove2(String s){
        if(s.length()==0) return "";
        String smallAns = remove2(s.substring(1));
        char currValue = s.charAt(0);
        if(currValue!='a'){
            return currValue+smallAns;
        }else{
            return smallAns;
        }
    }
}
