package arrays;

import java.util.Arrays;

public class pass_by_refrence {
    public static void main(String[] args) {
        int[]nums = {1,3,14,23};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] nums) {
        nums[0]=99;
    }
}
