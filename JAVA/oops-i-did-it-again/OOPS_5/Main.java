package OOPS_5;

public class Main {
    public static void main(String[] args) {
       // Parent obj = new Parent();-- abstract class cant be instantiated
        Daughter chaitra = new Daughter();
        chaitra.carrer("coder");
        chaitra.partner("ghoru",22);

        Son param = new Son();
        param.carrer("ML engineer");
        param.partner("cj",21);

        Daughter.method();//static methods cant be over-ridden but is inherited
    }
}
