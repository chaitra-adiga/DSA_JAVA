package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_prabhu {//array of primitive

    //demo hochi
    public static void main(String[] args) {
//        //store 5 roll nos
//        // so i can do -
//        int rno1 = 13;
//        int rno2=1;
//        int rno3 = 7;
//        int rno4=2;
//        int rno5= 6;
//        //but if 500 diya toh?
//        // loops mein bhi it can only overwrite - for/do-while/while
//
//        /*
//        thereby arrays came!
//        syntax -
//        datatype [] variable name= new datatype [size]
//
//         */
//
//        int []rollno = new int[5];
//        for (int i = 0; i < 5; i++) {
//            rollno[i]=i;
//            //System.out.println(i);
//
//        }
//        int[] ros; // declaration
//       // System.out.println(ros); ----------> not initialised
//        ros = new int[5]; // initialization
//        System.out.println(ros[2]);
//
//        String[] bb=new String[5];
//        System.out.println( bb[2]);
//
//
//
//        int[] arr = new int[5];
//        //1st way
//        arr[0]=99;
//        arr[1]=88;
//        arr[2]=880;
//        arr[3]=77;
//        arr[4]=898;
////        arr[5]=88;
////        arr[6]=88;
////
////        System.out.println(arr[6]); ------> compile time error !-------- index out of bound error
//
//       // System.out.println(arr[4]);

        int[] arr1 = new int[5];
        //2nd way
        Scanner in= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr1[i]=in.nextInt();
        }
//        for (int num: arr1) {
//            //System.out.print(num+"  ");
//
//
//        }
        System.out.println(Arrays.toString(arr1)); //------>> new way of printing

    }
}
