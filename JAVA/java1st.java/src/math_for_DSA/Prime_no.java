package math_for_DSA;

public class Prime_no {
    static int tot=0;
    public static void main(String[] args) {
        int n=20;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " is a Prime no. "+ isPrime(i));
        }
        System.out.println("there are total "+tot+" prime no.s ");
    }

    public static boolean isPrime(int n){


        if(n<=1)
            return false;
        int c=2;
        while (c*c<= n) {
            if(n%c==0){
                return false;
            }
            c++;
        }
        tot++;
        return true;
    }
}
