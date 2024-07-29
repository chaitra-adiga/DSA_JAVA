package com.functions;

import java.util.Arrays;

public class Function_overloading {
//    public static void main(String[] args) {
//
//        fun(67);
//        fun(34,56);
//        fun("GHORE");
//
//    }
//    static void fun(int a){
//        System.out.println("no. is "+a);
//
//    }
////    static int fun(int a){         ERROR - says it already exits as no. of arg are same + datatype same
////
////    }
//
//    static void fun(String name){
//        System.out.println("HELLO "+name);
//    }
//    static void fun(int a,int b){
//        System.out.println("Sum is "+(a+b));
//
//    }


    public static void main(String[] args) {
        //using vararg
        //demo();------> Ambiguous call
        demo(77,23,44,3);
        demo("Ghorura","Dam dham ","Dhamak baje!");


    }

    static int demo(int ...v){
        System.out.println(Arrays.toString(v));
        return 0;
    }
    static int demo(String ...v){
        System.out.println(Arrays.toString(v));
        return 0;
    }
}
