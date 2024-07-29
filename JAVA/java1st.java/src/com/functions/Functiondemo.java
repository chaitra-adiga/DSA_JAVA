package com.functions;

import java.util.Scanner;

public class Functiondemo {
    public static void main(String[] args) {
//       //int ans = sum2();
//        //sout(ans);
//        System.out.println(sum2());


        System.out.println("the sum is:- "+ sum3(20,77));
        //values are replaced by parameter given in the sum3() function

    }

    //parameters ke saath saath
    static int sum3(int a,int names_doesnt_matter){
        int sum= a+names_doesnt_matter;
        return sum;
    }



    // return type wala function

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=in.nextInt();
        System.out.print("Enter second number: ");
        int n2=in.nextInt();
        int sum=n1+n2;
        return sum; //returning sum instead of printing it

        //System.out.println("this command shows its unreachable since return is end of the function");

    }


    //no return
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=in.nextInt();
        System.out.print("Enter second number: ");
        int n2=in.nextInt();
        int sum=n1+n2;
        System.out.println("The sum is "+sum);
    }
}
