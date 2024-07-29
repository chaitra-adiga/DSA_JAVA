package binary_search;

public class Rotational_count {
    public static void main(String[] args) {
        int arr[] = {12,2,3,5,9};
        int tar=0;
        int ans = search(arr,tar);
        if( ans!= -1)
            System.out.println("Array is rotated "+ans+" times");
        else
            System.out.println("Array rotated 0 times");


    }
    static int search(int[] nums, int target) {
        int pivot=search_pivot(nums);
        if(pivot==-1)
            return-1;
        else {
            return pivot+1;
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
}
