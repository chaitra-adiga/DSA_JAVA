package conditions;
import java.util.Scanner;
public class Loops1st {
    public static void main(String[] args) {
//        /*
//            for loop
//                Syntax :-
//                for(initialization ;cond ; increment/decrement)
//         */
//        //Q:- print 1 to 5
//        for (int num = 1; num <=5 ; num++) {
//            System.out.println(num);
//        }
//
//        //q:- print hello word n times
//        Scanner in = new Scanner(System.in);
//        int n =in.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("hello guru !");
//        }
//
//        //Q:- print n numbers
//        int v =in.nextInt();
//        for (int i = 1; i < v+1; i++) {
//            System.out.print(i+" ");



        /*
                while loop
                syntax:-
                initialization
                while(cond){
                body
                increment}
         */

        int num=1;
        while(num<=5){
            System.out.println(num);
            num+=1;

        }

    }
}
