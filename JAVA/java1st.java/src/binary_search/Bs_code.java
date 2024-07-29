package binary_search;

public class Bs_code {
    public static void main(String[] args) {

        int[]arr={1,5,8,13,17,21,37,49,60};
        int tar= -21;
        System.out.println("enter target element ia at :- " +bs(arr,tar));
    }
    static int bs(int[]arr,int t){
        if(arr.length==0)
            return -1;
        int s=0;
        int e=arr.length-1;// length-1

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
