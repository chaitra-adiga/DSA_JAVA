package OOPS_4;

import java.util.Arrays;

public class Access_mod {
    int roll_no;
    public String name ;
    private int[] arr;
    protected float marks;

    Access_mod(int roll_no,String name,float marks){
        this.roll_no = roll_no;
        this.name = name;
        this.arr = new int[3];
        this.marks= marks;
    }
    public Access_mod(String name, float marks) {
        // initialization code
        this.name = name;
        this.marks= marks;
    }


    public int[] getArr() {
        return arr;
    }


    public void setArr(int[] arr) {
        this.arr = arr;

    }
}
