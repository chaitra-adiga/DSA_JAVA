package oops6_Object_cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human good_mani = new Human("Chaitra",21);
        //Human clone = new Human(good_mani); ---- over head for processing time
        Human clone = (Human) good_mani.clone();//because its used we must mention exeception
        System.out.println(clone.name+"-"+clone.age);
        System.out.println(Arrays.toString(clone.arr));
        clone.arr[0]= 500;
        System.out.println(Arrays.toString(clone.arr));
        System.out.println(Arrays.toString(good_mani.arr));
    }

}
