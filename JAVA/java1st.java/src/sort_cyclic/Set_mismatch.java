package sort_cyclic;

import java.util.Arrays;

class Set_mismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] arr) {
         int i=0;
        while(i<arr.length){
            int correct = arr[i]-1 ;
            if(arr[correct]!= arr[i]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        //checking errors
        for(int ind=0;ind<arr.length;ind++){
            if(arr[ind]!=ind+1){
                return new int[]{arr[ind],ind+1};
            }
        }
        return new int[]{-1,-1};
        
    }
     public static void swap(int[] arr,int one,int two){
        int temp= arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }

}