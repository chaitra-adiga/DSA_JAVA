package binary_search;

import java.util.Arrays;

public class BS_in2D_matrix_q2_Stricly_Sorted {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        System.out.println(Arrays.toString(search_in2d(arr,6)));
//    }
//
//
//
//    static int[] binary_search(int[][] matrix, int row,int cStart,int cEnd, int tar){
//        //this is simple binary search , from column start to column end
//        int mid = cStart+(cEnd-cStart)/2;
//        while(cStart<=cEnd){
//            if(matrix[row][mid]== tar)
//                return new int[] {row,mid};
//            if(matrix[row][mid]<tar)
//                cStart=mid+1;
//            else
//                cEnd=mid-1;
//        }
//        return new int[] {-1,-1};
//    }
//
//    static int[] search_in2d(int[][] matrix, int tar){
//        int row = matrix.length;
//        int col = matrix[0].length; //be cautious ,matrix can be empty
//
//        if(col==0){
//            return new int[]{-1,-1};
//        }
//
//        if(row==1){
//            return binary_search(matrix,0,0,col-1,tar);
//        }
//
//        //now we have to eliminate all the rows until twp rows are left
//        //by this while loop 2 or more rows will be left
//        int rStart= 0;
//        int rEnd= row-1;
//        int cMid=col/2;
//        while(rStart<(rEnd-1)){
//            //3 conditions of binary search
//            int mid= rStart+rEnd/2;
//            if(matrix[mid][cMid]==tar){
//                return new int[]{mid,cMid};
//            }
//            if(matrix[mid][cMid]<tar){
//                rStart=mid; //ignoring above rows
//            }
//            else
//                rEnd = mid; //ignoring below rows
//        }
//
//        // now there is two or morerows left in array
//        // now we have two rows
//        // check whether the target is in the col of 2 rows
//        if (matrix[rStart][cMid] == tar) {
//            return new int[]{rStart, cMid};
//        }
//        if (matrix[rStart + 1][cMid] == tar) {
//            return new int[]{rStart + 1, cMid};
//        }
//        //now search in 1st 2nd 3rd or 4th half for result
//
//        //1st half - apply binary search
//        if(matrix[rStart][cMid-1]<=tar){
//            return binary_search(matrix,rStart,0,cMid-1,tar);
//        }
//        //2nd half - apply binary search
//        if(matrix[rStart+1][cMid-1]<=tar){
//            return binary_search(matrix,rStart+1,0,cMid-1,tar);
//        }
//        //3rd half - apply binary search
//        if(matrix[rStart][cMid+1]>=tar){
//            return binary_search(matrix,rStart,cMid+1,matrix[rStart].length-1,tar);
//        }
//        //4th half
//        else
//            return binary_search(matrix,rStart+1,cMid+1,matrix[rStart].length-1,tar);
//
//    }
//
//
//
//}
public static void main(String[] args) {
    int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    System.out.println(Arrays.toString(search(arr, 9)));
}

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}

