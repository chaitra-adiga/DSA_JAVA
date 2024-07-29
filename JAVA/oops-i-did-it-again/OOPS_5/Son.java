package OOPS_5;

public class Son extends Parent{
    @Override
    void carrer(String name) {
        System.out.println("I want to be a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I want to be with "+name +" she is of "+age);
    }

    static void method(){
        System.out.println("its son method");
    }

}
