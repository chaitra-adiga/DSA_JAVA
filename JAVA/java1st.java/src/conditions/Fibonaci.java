package conditions;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        System.out.println("Enter the value of n for fibonaci series :-");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n==0){
            System.out.println("Enter a valid input ");
        }
        else if (n==1){
            System.out.println("0");
        }
        else if (n==2){
            System.out.println("0\n1");
        }

        else {
            int a=0,b=1;
            System.out.println(a+"\n"+b);
            for (int i = 0; i < n-1; i++) {

                int c=a+b;
                System.out.println(c);
                a=b;
                b=c;

            }

        }


    }
}
