package binary_search;

import java.util.ArrayList;
import java.util.Scanner;

public class Celing {
//    public static void main(String[] args) {
//        int[] arr={2,3,5,5,5,8,9,14,16,18};
//        System.out.print("Input the number for ceiling no. :- ");
//        Scanner in=new Scanner(System.in);
//        int target=in.nextInt();
//        //ArrayList<Integer> list= new ArrayList<>(8);
//        System.out.println(give_cn(arr,target));
//    }
//
//     static int give_cn(int[] nums, int cn) {
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]>=cn){
//                return nums[i];
//            }
//        }
//        return -1;
//    }








    //kunals method -BS
    public static void main(String[] args) {
        int[]arr={1,5,8,13,17,21,37,49,60};
        int tar= 65;
        if(bs(arr,tar)==-1)
            System.out.println("Invalid try");
        else
            System.out.println("ceiling no. is  : " +bs(arr,tar));
    }
    static int bs(int[]arr,int t){

        if(t>arr[arr.length-1])
            return -1;
        if(arr.length==0)
            return -1;
        int s=0;
        int e=arr.length-1;// length-1
        int mid;

        while(s<=e) {
            mid=(s+e)/2;
            if(t==arr[mid])
                return arr[mid];
            else if (t<arr[mid]) {
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return arr[s];
    }
}





