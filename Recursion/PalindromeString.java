public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(String s){
        if(rev(s).equals(s)){
            return true;
        }
        return false;
    }

    public static String rev(String s){
        if(s.length()==0){
            return "";
        }
        char curr= s.charAt(0);
        String ans =rev(s.substring(1));
        return ans+curr;
    }

    // USING TWO POINTERS
    public static void pal(String s, int l, int r) {
        if (l > r) {
            // Base case: palindrome found, print message only once
            System.out.println(s + " is Palindrome");
            return;
        }

        if (s.charAt(l) != s.charAt(r)) {
            System.out.println(s + " is not Palindrome");
            return;
        }

        // Recursively check inner substring, but don't print here
        pal(s, l + 1, r - 1);
    }
    public static boolean isPalindrome(String s, int l, int r) {
        if (l > r) {
            return true; // Base case: single character or empty string
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false; // Not a palindrome
        }
        return isPalindrome(s, l + 1, r - 1); // Recursive call
    }

    //PALINDROME INTEGERS(FUP QUESTION)
    public static boolean isPalindrome(int number) {
        String s = String.valueOf(number);
//        return isPalindrome(s);
        // or
        return isPalindrome(s,0,s.length()-1); //IN PLACE & OPTIMISED
    }

}
