package conditions;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        System.out.print("Enter the alphabet :- ");
        Scanner in = new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase!");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase!");
        }
        else {
            System.out.println("Enter a valid input");
        }

    }
}
