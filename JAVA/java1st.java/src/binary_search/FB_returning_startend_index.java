package binary_search;

import java.util.Arrays;

public class FB_returning_startend_index {

    //~~~BRUTE FORCE~~~
//
//    public static void main(String[] args) {
//        int[] nums={5,7,7,7,7,8,8,10};
//        int target = 7;
//        System.out.println(Arrays.toString(index_range(nums,target)));
//
//    }
//    static int[] index_range( int[] nums, int tar) {
//        //int j=nums.length-;
//        int s = -1, e = -1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == tar) {
//                s = i;
//                break;
//            }
//
//        }
//        for (int j = nums.length - 1; j > 0; j--) {
//            if (nums[j] == tar) {
//                e = j;
//                break;
//            }
//        }
//        return new int[] {s,e};
//    }


    public static void main(String[] args) {
        int[] nums={5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    }

