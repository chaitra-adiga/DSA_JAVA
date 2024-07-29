package com.functions;

public class Example2_for_function_understanding {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swapi(a,b);
        System.out.println(a+"  "+b);
       // System.out.println(swapi(a,b));
    }

    static void  swapi(int a1, int b1) {
        int temp = a1;
        a1=b1;
        b1=temp;
        System.out.println(a1+"  "+b1);

    }
//    static int swapi(int a1, int b1) {
//        int temp = a1;
//        a1=b1;
//        b1=temp;
//        return(a1);
//        //return(b);--- unreachable statement it says !
//    }
}
