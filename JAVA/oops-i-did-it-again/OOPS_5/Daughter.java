package OOPS_5;

public class Daughter extends Parent{

    @Override
    void carrer (String name){
        System.out.println("I want to be a "+name);
    }
    @Override
    void partner(String name , int age){
        System.out.println("I want to be with "+name +" he is of "+age);
    }
}
