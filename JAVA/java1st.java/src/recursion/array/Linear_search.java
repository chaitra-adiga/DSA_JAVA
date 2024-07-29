package recursion.array;

import java.util.ArrayList;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr={3,2,1,1,18,9,1};
        System.out.println("element at "+search(arr,0,1));
        System.out.println(search_from_backward(arr,arr.length-1,1));
        search_multipleindex(arr,1,0);
        System.out.println(list);
    }

    static int linear_search(int[] arr, int index,int tar) {
        if(index== arr.length){
            return -1;
        }
        else {
            if(arr[index]==tar){
                return index;
            }
        }
        return linear_search(arr,index+1,tar);
    }
    //better
    static boolean search(int[] arr, int index,int tar){
        if(index== arr.length){
            return false;
        }
        return arr[index]==tar || search(arr,index+1,tar);
    }
    static boolean search_from_backward(int[] arr, int index,int tar){
        if(index== -1){
            return false;
        }
        return arr[index]==tar || search_from_backward(arr,index-1,tar);
    }



    // multiple occurrences
    static ArrayList<Integer> list = new ArrayList<>();
    static void search_multipleindex(int[] arr, int tar,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==tar){
            list.add(index);
        }
        search_multipleindex(arr, tar, index+1);
    }

}


