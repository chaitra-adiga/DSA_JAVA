package arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(44);
//        list.add(40);
//        list.add(98);
//        list.add(654);
//        list.add(876);
//
//        System.out.println(list);
//        System.out.println(list.contains(98));
//        System.out.println(list.contains(9458));
//
//        list.set(3,777);
//        System.out.println(list);
//
//        list.remove(4);
//        System.out.println(list);





        Scanner in = new Scanner(System.in);


        //input

        for (int i = 0; i < 7; i++) {
            int ch =in.nextInt();
            list.add(ch);

        }

        //output

        //System.out.println(list);
        for (int i = 0; i < 7; i++) {
            System.out.print(list.get(i) + " ");// put index
            //list[index] syntax will not work here


        }

    }
}
