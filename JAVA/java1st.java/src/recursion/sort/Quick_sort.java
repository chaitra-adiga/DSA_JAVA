package recursion.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid=(s+e)/2;
        int pivot=nums[mid];

        while(s<=e){//this check is also a reason why we prefer QS over MS : because of this if arr is
            // already sorted we won't check more

            while (nums[s]<pivot){
                s++;//if i put && , even if one of the cond. is false - it wont enter loop also
                //but if i put || , then also if one condition is wrong both the pointers are incremented
                //and decremented which will not give us right result !
            }
            while(nums[e]>pivot){
                e--;
            }//when we arrive here, we'll be having a end which is less than pivot also we'll having a start
            //which violates condition , thereby we shall swap it = to solve both violation

            //when these both conditions are violated---- SWAP!
            if(s<=e){
                //check again-if its valid to swap or not
                int temp = nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }

        }
        //now its time for recursion call
        //now my pivot is at correct location please sort the other two halves now
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
