package linear_search;

import java.util.Arrays;

public class Search_in_2d {
    //mera method

    public static void main(String[] args) {
        int[][] arr2d = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}

        };
        int key = 18;
        System.out.println();
       // System.out.println("Item " + key + " is  " + ls_in_2d(arr2d, key));
        System.out.println("maximum of array is "+ max_2d(arr2d));

    }

    static String ls_in_2d(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (key == arr[i][j]) {
                    return ("found at " + (i + 1) + " row " + (j + 1) + " column");
                }

            }

        }
        return ("not found!");

    }


    //kunals method

    /* public static void main(String[] args) {
        int[][] arr = {
                {12, 23, 43, 54},
                {21, 45},
                {13},
                {5, 657, 786, 4, 45}

        };
        int key = 4;
        //answer is an array in the format of = {row,column}
        int[] ans = ls_in_2d(arr, key);

        System.out.println("found at index " + Arrays.toString(ans));
    }

    static int[] ls_in_2d(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (key == arr[i][j]) {
                    return new int[]{i, j};

                }
            }
        }
        return new int[]{-1, -1};
    }*/


    static int max_2d(int[][] arr){
        int max= arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }

        }
        return max;
    }


}
