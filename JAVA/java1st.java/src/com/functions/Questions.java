package com.functions;

import javax.swing.*;
import java.util.Scanner;


public class Questions {
    //q:- prime or not prime
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int n = in.nextInt();
//        isprime(n);
//
//    }
//
//     static void isprime(int n) {
//        if(n<=0){
//            System.out.println("Please enter a valid input!");
//            return;
//        }
//        else {
//            for (int i = 2; i <Math.sqrt(n) ; i++) {
//                if(n%i==0){
//                    System.out.println("Not a prime no.");
//                    return;
//                }
//
//            }
//            System.out.println("Prime no.");
//
//        }
//    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = in.nextInt();
        prime(n);

    }
    static void prime(int n){
        boolean ip=true;
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if(n%i==0){
                ip=false;
              //  return;
            }

        }

        if(ip)
            System.out.println("Prime no.");
        else
            System.out.println("not a prime no.");
    }
}


