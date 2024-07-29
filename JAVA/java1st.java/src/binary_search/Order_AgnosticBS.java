package binary_search;

public class Order_AgnosticBS {
    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 13, 17, 21, 37, 49, 60};
        int tar = 49;

        System.out.println("enter target element ia at :- "+agbs(nums,tar));
    }

    static int agbs(int[] nums, int tar){
        int s=0;
        int e=nums.length-1;

        boolean is_asc=nums[s]<nums[e];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==tar){
                return mid;
            }
            if(is_asc){
                 if (tar<nums[mid]) {
                    e=mid-1;
                }
                else
                    s=mid+1;

            }

            else {
                if (tar>nums[mid]) {
                    e=mid-1;
                }
                else
                    s=mid+1;

            }

        }
        return -1;
    }


    }



