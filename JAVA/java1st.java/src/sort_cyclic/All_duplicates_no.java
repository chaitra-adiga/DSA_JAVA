package sort_cyclic;

import java.util.ArrayList;
import java.util.List;

class All_duplicates_no {
    public static void main(String[] args) {
        int[] arr={3,3};
        System.out.println(findDuplicates(arr));

    }
    public static List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = i==0 ? arr[i]:arr[i]-1 ;
            if(arr[correct]!= arr[i]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                ans.add(arr[index]); //duplicate
            }

        }
        return ans;
    }
    public static void swap(int[] arr,int one,int two){
        int temp= arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
        
}
