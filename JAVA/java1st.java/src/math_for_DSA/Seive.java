package math_for_DSA;

public class Seive {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
    }

    public static void sieve(int n, boolean[] primes){
        //initially all the array elements are false
        //So we can turn the visited/multiple of 2 or 3 as true
        for (int i = 2; i*i<=n ; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;
                    //all multiples are true- only prime no. are false
                }
            }
            
        }

        for(int i= 2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
