package oops3_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle= new Circle();
           // Square square=new  Circle(); child obj cant point another type of child obj
        Shapes triangle=new Triangle();

       shape.area();
        circle.area();
        triangle.area(); //still object type is displ
    //void area() is same everywhere ,
        // the act of representing the same thing in multiple ways



        Aclass ca = new Aclass();
        ca.a=9;
        System.out.println(ca.a);

    }
}
