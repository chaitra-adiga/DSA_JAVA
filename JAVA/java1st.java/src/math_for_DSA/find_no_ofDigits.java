package math_for_DSA;

public class find_no_ofDigits {
    public static void main(String[] args) {
        int n =9;
        int b =2;
        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
