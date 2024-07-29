package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ofobjects {//arrays of object

    public static void main(String[] args) {
        String[] str = new String[4];
        Scanner in = new Scanner(System.in) ;
        for (int i = 0; i < str.length; i++) {
            str[i]= in.nextLine();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="Chaitra";
        str[3]="Hiyo hiyo";
        System.out.println(Arrays.toString(str));
    }
}
