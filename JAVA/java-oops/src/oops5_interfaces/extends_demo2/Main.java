package oops5_interfaces.extends_demo2;

public class Main implements A,B{

//interfaces.extends_demo2.Main inherits unrelated defaults
// for greet() from types interfaces.extends_demo2.A and interfaces.extends_demo2.B
    @Override
    public void fun() {

    }

    @Override
    public void greet() {

        System.out.println("Didnt call the default thin");
        A.super.greet();
    }

    public static void main(String[] args) {
       Main obj = new Main();
       obj.greet();
       A.staticmethod();
    }
}
