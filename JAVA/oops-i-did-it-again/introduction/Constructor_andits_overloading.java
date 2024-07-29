package introduction;

public class Constructor_andits_overloading {
    public static void main(String[] args) {
        Student_data chaitra = new Student_data();
        //System.out.println(chaitra.marks+ chaitra.name+ chaitra.rno); -- before constructor=default values
        System.out.println(chaitra.marks+ chaitra.name+ chaitra.rno);

        Student_data param = new Student_data(13,"Debopam",89.9f);
        System.out.println(param.rno+param.name+ param.marks);

        Student_data random = new Student_data(param);
        System.out.println(random.rno+random.name+ random.marks);
    }
}
class Student_data{
    int rno;
    String name;
    float marks=90.9f;

    //special function - constructor
    Student_data(){//this is type which accepts no parameters
//        this.name="Chaitra";
//        this.rno=1;
//        this.marks= 88.8f;
//internally : new Student_data(default,100.0f);
        this("default",100.0f);//calling constructor from constructor
    }

    Student_data(int rno, String name , float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    Student_data( String name , float marks){
        this.name=name;
        this.marks=marks;
    }

    Student_data(Student_data other){
        this.name= other.name;
        this.rno= other.rno;
        this.marks=other.marks;

    }

}
