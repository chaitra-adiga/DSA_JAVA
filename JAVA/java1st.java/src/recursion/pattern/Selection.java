package recursion.pattern;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={77,3,9,65,0,-1};
        s_sort(arr, arr.length,0 ,0);
        System.out.println(Arrays.toString(arr));
    }
    static void s_sort(int[]arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                //swap
                s_sort(arr,r,c+1,c);
            }else{
                s_sort(arr,r,c+1,max);
            }
        }else{
            //swap max index ka element with list index
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            s_sort(arr,r-1,0,0);//new row call
        }
    }
}
