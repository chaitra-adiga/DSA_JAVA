package sort_selection;

import java.util.Arrays;

public class Selection_sort_code {
    public static void main(String[] args) {
        int[] arr={-1,-4,-77,-98,7,45,1,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        //find the max item in array and swap with correct index
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxIndex= getmaxIndex(arr,0,last);
            //swap max index with last
            int temp = arr[maxIndex];
            arr[maxIndex]= arr[last];
            arr[last]=temp;
        }

    }

     static int getmaxIndex(int[] arr, int start, int end) {
        int max=start;

         for (int i = start; i <= end ; i++) {
             if(arr[i]>arr[max]){
                 max=i;
             }
         }
        return max;
    }

}
