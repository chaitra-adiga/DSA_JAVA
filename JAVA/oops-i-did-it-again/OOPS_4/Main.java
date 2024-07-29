package OOPS_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //let's see how things are in modifiers
        Access_mod obj = new Access_mod(11,"Chaitra ",99.7f);
        System.out.println(obj.marks+" "+ obj.roll_no);//protected and no modifier
        //System.out.println(obj.arr);
        int[] num ={1,4,5};
        obj.setArr(num);
        System.out.println(Arrays.toString(obj.getArr()));
    }
}
