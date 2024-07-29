package recursion.array;

import java.util.ArrayList;

public class Return_ArrayList {
    public static void main(String[] args) {
        int[] arr={3,1,47,9,1,1,3,1};
        //System.out.println(return_arraylist(arr,1,0, new ArrayList<>())); //this array list the original
        //object where the addition of elements or amendments affect.
        //same throughout and it's the one which is returned

        ArrayList<Integer> ans= return_arraylist2(arr,1,0);
        System.out.println(ans);

    }

    static ArrayList<Integer> return_arraylist(int[] arr, int tar, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(tar==arr[index]){
            list.add(index);
        }

        return return_arraylist(arr,tar,index+1,list);
    }


    static ArrayList<Integer> return_arraylist2(int[] arr, int tar, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //here answer is stored in an individual list only available in this function call
        if(tar==arr[index]){
            list.add(index);
        }

        ArrayList<Integer> ansfromBelow = return_arraylist2(arr,tar,index+1);
        list.addAll(ansfromBelow);
        return list;

    }
}
