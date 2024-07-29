package oops5_abstract_classes;

public abstract class  Parent {
    int age;
    static void hello(){
        System.out.println("hey mama");
    }

    void non_static_hello(){
        System.out.println("hey mama"+age);
    }

    public Parent(int age) {
        this.age = age;
    }

    abstract void carrier (String name);
    //class should be declared as abstract
    abstract void partner (String name , int age);
}
