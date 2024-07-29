package sort_cyclic;

import java.util.ArrayList;
import java.util.List;

public class Disappered_no {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(print_missing_no(arr));

    }
    static List<Integer> print_missing_no(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[correct]!= arr[i]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
//        int c=0;
//        for (int index = 0; index < arr.length; index++) {
//            if(index+1!=arr[index]){
//                System.out.print(index+1+" ");
//                c++;
//            }
//
//        }
//        if(c==0) {
//            System.out.println(arr.length);
//            c++;
//        }
//        System.out.println();
//        System.out.println("Total no. of missing no.s are "+c);

        // list

        List<Integer> ans= new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                ans.add(index+1); //missing value
            }

        }
        return ans;
    }
    static void swap(int[] arr, int first,int last){
        int temp= arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
