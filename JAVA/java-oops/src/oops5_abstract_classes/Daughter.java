package oops5_abstract_classes;

public class Daughter extends Parent {
    public Daughter(int age){
        super(age);
    }
    @Override
    void carrier(String name){
        System.out.println("I am going to be a "+name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love "+ name+"he is of "+age);
    }

}
