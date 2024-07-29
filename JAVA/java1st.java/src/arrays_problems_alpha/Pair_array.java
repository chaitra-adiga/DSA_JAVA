package arrays_problems_alpha;

import java.util.Arrays;

public class Pair_array {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10};
        pair_print(arr);

    }

    static void pair_print(int[] arr){
        int tp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print(Arrays.toString(new int[]{arr[i],arr[j]}));
                tp++;

            }
            System.out.println();

        }
        System.out.println("Total number of pairs :- "+ tp);

    }
}
