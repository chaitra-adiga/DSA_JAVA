package oops6_generics.Object_comparision;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "( "+ marks+ " )";
    }

    @Override
    public int compareTo(Student o) {
        //System.out.println("hey");--to checK whether it's going through this method during Arrays.sort
        int diff = (int)(this.marks- o.marks);
        return diff;
    }

}
