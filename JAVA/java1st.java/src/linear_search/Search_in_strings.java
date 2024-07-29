package linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class Search_in_strings {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string :- ");
        String str = ip.nextLine();
        System.out.println("Enter the character :- ");
        char c = ip.next().charAt(0);
        boolean ans = ls_string(str, c);
        System.out.println(ans);
        System.out.println(Arrays.toString(str.toCharArray()));

    }

    static boolean ls_string(String str, char ch) {
        if (str.length() == 0)
            return false;

      /*  for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)){
                return true;
            }

        }*/

        for (char cha : str.toCharArray()) {
            if (cha == ch)
                return true;
        }
        return false;
    }
}
