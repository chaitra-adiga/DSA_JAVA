package String_basics;

public class Palindrome {
    public static void main(String[] args) {
        String str= "abba";
        System.out.println(ispalindrome(str));

    }
    static boolean ispalindrome(String str){
        if( str==null||str.length()==0) {
            return false;
        }
        int n= str.length();
        for (int i = 0; i <=n/2 ; i++) {
            char s = str.charAt(i);
            char e= str.charAt(n-1-i);
            if(s!=e){
                return false;
            }
        }
        return true;
    }
}
