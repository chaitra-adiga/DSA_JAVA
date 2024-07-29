package math_for_DSA;

public class Giving_prime_no_Brute_force {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 0; i <=n; i++) {
            if (check_prime(i) != 0) {
                System.out.println(check_prime(i));
            }
        }
    }

    public static int check_prime(int n){
        if(n<=1){
            return 0;
        }
        int c=2;
        while(c*c <= n){
            if(n%c==0){
                return 0;
            }
            c++;
        }
        return n;
    }
}
