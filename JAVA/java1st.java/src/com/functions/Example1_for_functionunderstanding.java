package com.functions;
//Examples !
public class Example1_for_functionunderstanding {
    public static void main(String[] args) {
//        String name ="Chaitra Adiga";
//
//        change(name);
//        System.out.println(change(name));
//        System.out.println(name+"\n\n"); // why still name is not changed

        // since string are immutable we cant change them from rv and
        // naam was initially pointing to chaitra but the after a obj was created & its pointing to that now

    }
//string example 1
     static String change(String naam) {
        naam="Chinamyi Adiga";
         return naam;
    }
}
