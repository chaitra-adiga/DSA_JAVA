package introduction;

public class Object_manupulation {
    public static void main(String[] args) {
        System.out.println("lets use our datatype student ");
        Student chaitra = new Student(); //object created of student type + class is instantiated
        chaitra.rno=26;
        chaitra.name="Chaitra Adiga";
        //chaitra.marks= 9.2f;

        System.out.println(chaitra.name+" "+chaitra.rno+" "+ chaitra.marks);
    }
}
 class Student{
    int rno;
    String name;
    float marks=90.9f;

}
