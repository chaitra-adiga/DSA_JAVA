package sort_bubble;

import java.util.Arrays;

public class Bubble_sort_code {
    public static void main(String[] args) {
        //int[] arr={7,1,3,5,2};
        int[] arr={3,1,5,4,2};
        bubble(arr);
        System.out.print("Sorted array is "+ Arrays.toString(arr));
        //in place sorting alg.
    }

    static void bubble(int[] arr){
        //run for n-1 steps
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            //for each item largest would come for n-1 index
            //if for a particular value of i swap didn't occur
            //it means that array already in arranging order
            for (int j = 1; j <= arr.length-i-1; j++) {
                //swap if the item is smaller than prev.
                if(arr[j-1]>arr[j]){
                    //swap
                    int temp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }

            }

            //so here we break the loop if boolean swapped is false
            //since we dont need to check the already arranged values
            //if u dint swap for a particular value of i , it means that arr is already in asc. order

            if(!swapped)
                break;


        }
    }


}
