package linear_search;

public class Even_no_ofdig {
    public static void main(String[] args) {
        //take arr as ip and to each element say whether its having even no. of digits

        int[] arr={12,123,456,5674,98,1};
        find_even(arr);
    }

     static int find_even(int[] nums) {
        int count=0;
        for(int num : nums){
            if(even(nums))
                count++;
        }


        return count;
    }

    private static boolean even(int[] arr) {

    return false;
    }
}
