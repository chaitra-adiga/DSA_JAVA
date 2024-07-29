package binary_search;

public class Rotated_BS {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar=0;
        int ans = search(arr,tar);
        if( ans!= -1)
            System.out.println(ans);
        else
            System.out.println("invalid search");


    }
    static int search(int[] nums, int target) {
        int pivot=search_pivot(nums);
        if(pivot==-1)
            return bs(nums,target,0,nums.length-1);
        else {
            int first = bs(nums, target, 0, pivot);
            if (first != -1)
                return first;
            else
                return (bs(nums, target, pivot + 1, nums.length - 1));
        }

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
    static int bs(int[]arr,int t,int s,int e){
        if(arr.length==0)
            return -1;

        while(s<=e) {
            int mid =(s+e)/2;
            if(t==arr[mid])
                return mid;
            else if (t<arr[mid]) {
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return -1;
    }
}
