package a_arevision;

public class Shadowing {
    static int x =90;
    public static void main(String[] args) {
        System.out.println("the class variable is "+ x);
        int x =20;
        System.out.println("The value shown is "+ x+ " local variable one ");
        x=x+10;
        System.out.println(x+" local one changes ");
        global_x();
    }

    //if i make another method
    //i can create class outside this class , so then x will be out of scope

    static void global_x(){
        System.out.println("if i print x now , it'll print global one "+x);
        int x = 55;
        System.out.println("now again shadowing is seen "+x);
    }
}
