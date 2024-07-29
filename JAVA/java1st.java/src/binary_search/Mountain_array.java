package binary_search;

public class Mountain_array {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));

    }
    static public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e= arr.length-1;
        while(s!=e) {
            int mid =(s+e)/2;
            if(arr[mid]>arr[mid+1])
                e = mid;
            else if (arr[mid]<arr[mid+1]) {
                s=mid+1;
            }
        }
        return s;

    }
}
