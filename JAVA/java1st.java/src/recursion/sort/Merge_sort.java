package recursion.sort;

import java.util.Arrays;

public class Merge_sort {
  public static void main(String[] args) {
        int[] arr={5,99,23,55,0,1,45,88,3};
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge(int[] arr){
        //base
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr,0,mid));
        int[] right= merge(Arrays.copyOfRange(arr,mid,arr.length));

        return  sort(left,right);
    }

    static int[] sort(int[] first , int[] second){
        int[] mix= new int[first.length+ second.length];
        int i = 0; //first
        int j = 0; //second
        int k = 0; //ans

        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;

            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        //now what if one of the array is finished , but other has elements - just add to ans / dont compare
        //it might be possible that one of the array is not complete--- copy the remaining elements
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }
}

