package binary_search;

public class Rotated_min {
    public static void main(String[] args) {
        int arr[] = {10,9,10,10,10};
        int ans = findMin(arr);
        if( ans!= -1)
            System.out.println("minimum of array is element "+ans);


    }
    static int findMin(int[] nums) {
        int pivot=search_pivot(nums);
        if(nums[0]<nums[pivot+1])
            return nums[0];
        else
            return nums[pivot+1];
        }


    static int search_pivot(int arr[]){
        int s=0;
        int e= arr.length-1;
        int mid=0;
        while(s<=e){
            mid = (e+s)/2;
            if(mid<e && arr[mid]>arr[mid+1]) // if this check was for last element then mid+1 will be index out of bound
                //thereby check 1st if mid<end
                return mid;
            if(mid>s&&arr[mid]<arr[mid-1])
                return mid-1; //biggest element is pivot
            if(arr[s]>=arr[mid])
                e=mid-1;
            else
                s=mid+1;

        }
        return -1;
    }

    }



