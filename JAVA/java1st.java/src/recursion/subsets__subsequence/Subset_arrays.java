package recursion.subsets__subsequence;

import java.util.ArrayList;
import java.util.List;

public class Subset_arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans = subset_iretative(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset_iretative (int[] arr){
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr ){
            //for every number in array , i'll find out the no. of lists and make new ones
            int n= outer.size();//this will say the size of answer list
            //if its 4, create new 4 list copy the previous ones and add the element / no. of arr
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));//shorcut to copy
                internal.add(num); // coppying current arr element to internal list
                outer.add(internal); //adding to outer list / answer
            }
        }

        return outer;
    }
}
