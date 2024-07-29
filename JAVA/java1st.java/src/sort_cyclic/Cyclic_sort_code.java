package sort_cyclic;


import java.util.Arrays;

public class Cyclic_sort_code {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[correct]!= arr[i]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

    }
    static void swap(int[] arr, int first,int last){
        int temp= arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
