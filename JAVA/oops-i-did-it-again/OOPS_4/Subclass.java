package OOPS_4;

import java.util.Arrays;

public class Subclass extends Access_mod{

    Subclass(int roll_no, String name, float marks) {
        super(roll_no, name, marks);
    }

    public static void main(String[] args) {
        Access_mod obj1 = new Subclass(33,"param",100.0f);
        Access_mod obj2 = new Access_mod(26,"Chaitra",99.9f);
        System.out.println(obj2.marks);//was invalid in diff pkg

        float n= obj1.marks; //protected
        int m = obj1.roll_no;//no mod
        System.out.println(Arrays.toString(obj1.getArr()));
    }
}
