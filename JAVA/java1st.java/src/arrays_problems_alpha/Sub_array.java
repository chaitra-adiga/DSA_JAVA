package arrays_problems_alpha;

import java.util.Arrays;

public class Sub_array {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10};
        subarray_print(arr);
    }

    public static void subarray_print(int[] arr){
        int ts=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print( arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total no. of sub arrays "+ts);
    }
}
