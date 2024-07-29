package a_arevision;

import java.util.Scanner;

public class Built_ins {
    public static void main(String[] args){
        String greeting = "   Namaste";
        System.out.println(greeting.charAt(6));
        System.out.println(greeting.trim().charAt(6));

        Scanner in = new Scanner(System.in);
        System.out.println("enter some thing");
        System.out.println("Displaying the character at zero position withouth trim - "+in.next().charAt(0));

    }
}
