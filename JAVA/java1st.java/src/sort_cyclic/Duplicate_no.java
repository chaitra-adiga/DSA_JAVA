package sort_cyclic;

class Duplicate_no {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        //cyclic sort
        int i=0;
        while(i<nums.length){
            if(nums[i]!= i+1){
                int correct= nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else
                 return nums[i];
            }
            else{
                i++;
            }
        
        }
        return -1 ; //no duplicates
    }
    public static void swap(int[] arr,int one,int two){
        int temp= arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
}