package oops6_generics.Object_comparision;

import java.util.Arrays;
import java.util.Comparator;

public class Main_for_in_built_sort {
    public static void main(String[] args) {
        Student chaitra = new Student(26,99f);
        Student param = new Student(30,99f);
        Student ashish = new Student(20,98f);
        Student aditi = new Student(6,96f);
        Student khushi = new Student(47,94f);
        Student chaithra = new Student(26,99f);
        Student keerti = new Student(45,94.7f);//93.7 -- bug!
        Student chetan = new Student(39,90.6f);

        Student[] list = {chaitra,param,ashish,aditi,khushi,chaithra,keerti,chetan};
        System.out.println(Arrays.toString(list));
        //Arrays.sort(list);
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //System.out.println("yo");--- proof that this is only working
//                //return (int)(o1.marks-o2.marks) ; -- asc order
//                //return (int)(o2.marks-o1.marks) ; //--dsc order
//                return -(int)(o1.marks-o2.marks) ; //-- dsc order
//            }
//        });
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));
    }
}
