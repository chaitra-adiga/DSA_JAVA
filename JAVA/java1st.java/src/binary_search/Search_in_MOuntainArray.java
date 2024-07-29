package binary_search;

public class Search_in_MOuntainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,11,5,3,1};
        int tar= 3;
        System.out.println(search(arr,tar));
    }

    static int search(int[] arr,int tar){
        int max =peakIndexInMountainArray(arr);
        int asc =agbs(arr,tar,0,max );
        if(asc!=-1)
            return asc;
        //else just look in other half
        return agbs(arr,tar,max+1,arr.length-1);
    }
    static public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e= arr.length-1;
        while(s<e) {
            int mid =(s+e)/2;
            if(arr[mid]>arr[mid+1])
                e = mid;
            else if (arr[mid]<arr[mid+1]) {
                s=mid+1;
            }
        }
        return s;

    }
    static int agbs(int[] arr, int target,int start,int end){

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}



