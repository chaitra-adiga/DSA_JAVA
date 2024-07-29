package pattern_questions;

import java.util.Scanner;

public class Star_right_angle_tri {
    public static void main(String[] args) {
        //identify no. of rows == no. of times outer loop runs
        //identify  --- for every row how many columns
        // ---- types of element in column
        // what to print
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows :-  ");
        n= in.nextInt();
        pattern12(n);


    }

    static void pattern12(int n){
        for (int row = 0; row <2*n ; row++) {
            int totalcol= row>n? row-n :n-row;
            int totalspace= row>=n? row-totalcol:row;
            for (int spaces = 0; spaces <= totalspace; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed , we need to add new line.
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }

    static void pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int totalcol=row>n ? n-(row-n) : row;
            for (int col = 1; col <=totalcol ; col++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int i = 1; i <= 2*n; i++) {
            int totalcol=i>n ? n-(i-n) : i;
            int spaces=n-totalcol;
            for (int s = 0; s <=spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= totalcol; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <=n ; row++) {

            for (int spaces = 0; spaces <= n-row ; spaces++) {
                System.out.print("  ");
            } //spaces at beginning
            for (int col = row; col >=1  ; col--) {
                System.out.print(col+" ");
            } //n to 1
            for (int col = 2; col <= row  ; col++) {
                System.out.print(col+" ");
            } //2 to n
            System.out.println();
        }
    }

    static  void  pattern17(int n){
        for (int row = 1; row <=2*n ; row++) {
            int c =row>n ? n-(row-n) : row;
            for (int spaces = 0; spaces <=n-c ; spaces++) {
                System.out.print("  ");
            }

            for (int col = c; col >=1 ; col--) {
                System.out.print(col+" ");
            }//from n to1
            for (int col = 2; col <=c ; col++) {
                System.out.print(col+" ");
            }//from 2 to n(row)
            System.out.println();
        }
    }

}
