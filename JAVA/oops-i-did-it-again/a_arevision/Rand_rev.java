package a_arevision;

import java.util.Scanner;

import static java.lang.System.exit;

public class Rand_rev {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Give a number and I'll tell you whether it's prime or not:- ");
        int n = inp.nextInt();
        if(n>0){
            if(n==1){
                System.out.println("Neither a prime nor a composite no.");
            }
            else {
                for(int i=2 ; i<n;i++){ //root n for optimization
                    if(n%i==0){
                        System.out.println("Not a prime number");
                        return;
                    }
                }
                System.out.println("Hurrrayyyyy! its a prime no.");

            }
        }
        else
            System.out.println("Invalid");

    }

}
