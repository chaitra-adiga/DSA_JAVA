package com.functions;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(3,2,4,5,8);
        demo(2,45,"Kunal","Ghoree","Ghorur");

    }
    static void fun(int ...v){
       // System.out.println(v);---> Garbage value which is reference value([I@4dd8dc3)
        System.out.println(Arrays.toString(v));
    }
    static void demo(int a,int b,String...v){
        System.out.println(Arrays.toString(v));
    }
}
