public class Toggle {
    public static void main(String[] args) {
        String s = "PhysICS";
        toggle(s);
        // System.out.println(s);
    }
    public static void toggle(String s){
        StringBuilder str = new StringBuilder(s);
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch==' ') continue;  // handling edge case of (SPACE CONSTRAINT);
            if (!Character.isLetter(ch)) {
                continue;  // Skip non-alphabetic characters
            }
            int asci = (int) ch;
            if(asci>=97){
                asci-=32;
                char dh = (char) asci;
                str.setCharAt(i,dh);

            }else{
                asci+=32;
                char dh = (char) asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
