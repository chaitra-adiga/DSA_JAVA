package recursion.sort;

import java.util.Arrays;

public class Merge_sort_INPLACE {
    public static void main(String[] args) {
        int[]  arr={5,4,32,1};
        merge_sort_inplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge_sort_inplace(int[] arr, int s , int e){
        if(e-s==1){
            return ;
        }
        int mid= (e+s)/2;
        merge_sort_inplace(arr,s,mid);
        merge_sort_inplace(arr,mid,e);

         merge(arr,s,mid,e);
    }

    static void merge(int[] arr, int s, int m, int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;

        while(i< m && j< e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
                k++;
            }else {
                mix[k]=arr[j];
                j++;
                k++;
            }
        }

        //what if one array is not completed
        while(i< m){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        //copy in orignal array
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }
}
