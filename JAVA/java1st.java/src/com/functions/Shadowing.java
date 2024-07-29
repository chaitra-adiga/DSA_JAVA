package com.functions;

public class Shadowing {
    static int x=100; //higher scope - static makes it object independent
    //class variable

    public static void main(String[] args) {
//        System.out.println("Class variable :- "+x);
//        int x=89;
//        System.out.println("Local variable:- "+x);
//        //this local variables scope in this main method only
//        fun();

        System.out.println("Class variable :- "+x);
        int x;                                              /* declaration
        //System.out.println(x);----> x not initialised             no scope
        x=90;                                                  intilization
        System.out.println(x);                                  scope*/

        //scope begins when initialization of local variable is done

    }
    static void fun(){
//        System.out.println("THE VALUE of x is "+x);
//        //higher scope variable or class variable is used
    }
}
