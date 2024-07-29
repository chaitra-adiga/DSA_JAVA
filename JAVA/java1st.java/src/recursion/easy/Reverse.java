package recursion.easy;

public class Reverse {
    static int rev=0;
    public static void main(String[] args) {
        int n=1;
        System.out.println(rev2(n));
        System.out.println(ispalindrome(n));
    }
    public static void rev1(int n){
        if(n==0){
            System.out.println(rev); // here only once the value rev printed , then return is having no value
            return;
        }
        rev= rev*10+(n%10);
        rev1(n/10);
    }

    public static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);

    }
    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }

    public static boolean ispalindrome(int n){
        if(n== rev2(n)){
            return  true;
        }
        return false;
    }

}
