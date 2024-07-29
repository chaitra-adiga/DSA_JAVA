package oops2_singleton;
import oops4_access.A;

public class Subclass_access extends A {
//    public Subclass_access(int num, String name) {
//        super(num, name);
//    }
//
//    Subclass_access obj = new Subclass_access(11,"guru");
//    int n = obj.getNum();
//    int m = obj.num;


    /*Here only subclass can access protected member
    * not even main class
    * A obj = new Subclass_access(11,"guru");
    * that is why this showed error -- it can only be accessed with subclass
    * in different package , even parent/base class cant access it in different package */
//since A is parent class and parent class doesn't know anything , i.e above class don't know anything
    //about child classes --- that's why dependency of protected would only work with subclass of
    //other package , if it would be accessible by A r.v then its public


        public Subclass_access(int num, String name) {
            super(num, name);
        }

        public static void main(String[] args) {
            A obj = new A(45, "Kunal Kushwaha");
//        int n = obj.num;
        }
    }

    class SubSubclass extends Subclass_access {

        public SubSubclass(int num, String name) {
            super(num, name);
        }

        public static void main(String[] args) {
            SubSubclass obj = new SubSubclass(45, "Kunal Kushwaha");
            int n = obj.num;
        }
    }

    class SubClass2 extends A {

        public SubClass2(int num, String name) {
            super(num, name);
        }

        public static void main(String[] args) {
            SubClass2 obj = new SubClass2(45, "Kunal Kushwaha");
//
        }

    }

