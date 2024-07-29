package oops2_static_example;

public class Main {
    public static void main(String[] args) {
        Human param= new Human(22,"Debopam",10000000,false);
        Human chaitra= new Human(20,"Chaitra Adiga",50000000,false);
        Human mithun=new Human(27,"Mithun ",6000000,true);

        System.out.println(param.name);
       // System.out.println(param.population); ----- it'll work but by convension
        System.out.println(Human.population);

        //object creation for non-static method
        Main myobj = new Main();
        // explicitly calling non-static method by object
        myobj.fun2();
        myobj.greeting();
        myobj.amichecking();
    }
    // this is not dependent on objects
    static void fun() {
//        Main.greeting(); ----- even this cant be done
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non-static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {

        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
        fun();
        System.out.println("Hello world");
    }
    void amichecking(){

        System.out.println("ayyy yoo");
    }
}

