package oops1_introduction;

public class Class_eg {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student chaitra;
        chaitra = new Student();
        Student student1 = new Student();
        System.out.println(student1);
        System.out.println(chaitra.roll_no);
        System.out.println(chaitra.cc);
        System.out.println(chaitra.bb);
        //System.out.println(Arrays.toString(students)); ------> [null, null, null, null, null]
    }




    //for every single student , what does it contain
    //this is outside method but inside our main class - class_eg
    static class Student {

        int roll_no ;
        String name ;
        float marks ;
        char cc;
        /*The default value of a char attribute is indeed '\u0000'
        (the null character) .the line System.out.println('\u0000'); prints a little square,
          meaning that it's not a printable character - as expected.*/
        boolean bb; //false
    }
}
