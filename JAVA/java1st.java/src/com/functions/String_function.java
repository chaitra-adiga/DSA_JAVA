package com.functions;

import java.util.Scanner;

public class String_function {
    public static void main(String[] args) {
        System.out.println("Please enter your name :");
        Scanner i = new Scanner(System.in);
        String naam = i.nextLine();
        System.out.println(greet(naam));
    }

   static String greet(String naam) {

        return ("namaste "+ naam);
    }
}
