package a_arevision;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter till which no. - ");
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();
        System.out.print("fibo of "+n+" is ");
        int a =0;
        int b =1;
        int count=2;
        int c =0;
        for(int i = count; count<=n; count++){//here i did n-1 thing by removing = in count <n
//            c = a+b;
//            a=b;
//            b=c;
            int temp= b;
            b=b+a;
            a=temp;
        }
        System.out.println(b);
    }
}
