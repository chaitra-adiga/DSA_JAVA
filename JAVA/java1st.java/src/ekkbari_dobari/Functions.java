package ekkbari_dobari;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        //Q:- to build a function which finds largest of three
        //Q:- largest of 2
        Scanner in= new Scanner(System.in);
        System.out.println("Enter three numbers to find the largest:- ");
        int a = in.nextInt();
        int b = in.nextInt();
       // int c = in.nextInt();
        //int res= largest3(a,b,c);
        int res= largest2(a,b);
        System.out.println("The largest is  "+res);
    }

     static int largest2(int a, int b) {
        return a>b?a:b;
    }
//    static float largest2(int a, int b){
//        return type is never considered !!
    //they are considered as same function hence overloading not possible
//    }

    static int largest3(int a,int b,int c){
//        int max=a;
//        if(b>max && b>c)
//            max=b;
//        else if (c>max && c>b) {
//            max = c;
//        }
//        return max;



        if(a>b && a>c)
            return a;
        else if (b>c) {
            return b;
        }
        else return c;
    }
}
