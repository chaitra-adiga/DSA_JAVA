package binary_search;

import java.util.Arrays;

public class BS_in2D_matrix_q1 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int[] ans =bs_for2d(arr,-49);
        if (ans[0] !=-1 && ans[1]!= -1) {
            System.out.println(Arrays.toString(bs_for2d(arr, 49)));
        }
        else System.out.println("element not found");



    }

    static int[] bs_for2d(int[][] matrix, int target){
        int r=0;
        int c= matrix.length-1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }

            if(matrix[r][c]<target){
                r++; //skipping that row
            }

            else
                c--; //skipping that column
        }
        return new int[] {-1,-1};
    }
}
