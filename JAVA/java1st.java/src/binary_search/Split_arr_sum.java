package binary_search;

public class Split_arr_sum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k= 2;
        System.out.println(splitArray(nums,k));

    }
    static int splitArray(int[] nums, int k) {
        //k is the  no. of sub arrays - whose sum should be minimum of the largest sum of all sub array
        //first find range {i.e - lower limit , upper limit}
        //here lets take start,end

        int start=0;
        int end =0;
        for (int i = 0; i < nums.length; i++) {
            start= Math.max(start,nums[i]);
            end+=nums[i];
            
        }
        //binary search
        while(start<end){
            int mid= start+(end-start)/2;
            int maxsum=0;
            int pieces=1;
            for(int num: nums){
                if(maxsum+num>mid){
                    //this is when it's exceeding the limit , thereby we need new array/subarray
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    maxsum= num;
                    pieces++;
                }
                else {
                    maxsum+=num;
                }
            }

            //now we have got no. of pieces/ sub array so we compare this to given
            // limit , which is k=2
            if(pieces<=k)
                end=mid;
            //here this means that individual sum or max sum is more thats why pieces are less
            //so to tackle this we reduce the size [10,32] such that max sum becomes less and
            //more no. of pieces come
            else
                start=mid+1;
            //this occurs when (pieces>k) --- that means max sum/individual sum is less
            //so more no. of pieces are generated to reduce no. of pieces
            //we increase maximum sum or individual sum

            // no. of pieces ----inversly prop.----- maximum sum / individual sum
        }
        return start;
        //also end could be returned ,both are same

    }


}
