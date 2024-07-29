package String_basics;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'*'b');
        //here its adding ascii value of a and b
        System.out.println("a"+"b");
        //here its doing concatenation of strings
        System.out.println((char) ('a'+3));
        //ascii values converted into character


        //examples where a + performs concatenation of string and other datatype
        //here the object calls toString method which converts any class/ datatype to String
        // and performs concatenation.
        //if primitive datatype is used - its converted into wrapper class of that type - then object is there

        System.out.println("Chaitra"+ new ArrayList<>());
        System.out.println("ca"+56);
        System.out.println("a"+1);

        System.out.println("ca"+ new Integer(56));
       // System.out.println(new ArrayList<>()+new Integer(56)); ---- ERROR
        // + operator only works with string or primitives , atleast one string should be there
        // even if its empty string ; and the result will be of string type --- to String method

        System.out.println(new ArrayList<>()+""+new Integer(56));
    }
}
