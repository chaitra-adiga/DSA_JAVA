package oops1_introduction;

import java.util.Scanner;

public class Java_constructors_n_this {
    public static void main(String[] args) {
//        Student chaitra = new Student();
//        chaitra.roll_no=26;
//        chaitra.name="Chaitra Adiga";
//        //chaitra.salary ---- java is static lang. cant create anything which is not in template
        Scanner ip = new Scanner(System.in);
        Student stu = new Student() ;
        System.out.println("Enter name, roll no. and marks of student:");
        String n = ip.nextLine();
        int rno = ip.nextInt();
        float m = ip.nextFloat();

        stu.name=n;
        stu.roll_no=rno;
        stu.marks= m;
        System.out.println(stu.name);
        System.out.println(stu.roll_no);
        System.out.println(stu.marks);

// but if I had 100 properties of class student , would it be wise to allocate all of that by
        // writing into code ---- NO ---- so constructors are used


    }
    static class Student{
        int roll_no ;
        String name ;
        float marks ;

    }
}
