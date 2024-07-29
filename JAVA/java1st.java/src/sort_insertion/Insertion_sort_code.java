package sort_insertion;

import java.util.Arrays;

public class Insertion_sort_code {
    public static void main(String[] args) {
        int[] arr={-1,-4,-77,-98,7,45,1,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j >0 ; j--) {
                //since j checks in left hand side ,j should decrease
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else
                    break;

            }

        }
    }
}
