package OOPs_2;

public class Human {
    public static void main(String[] args) {
        Humanz chaitra = new Humanz(21,"Chaitra Adiga",4000000,false);
        System.out.println(Humanz.popu);
        Humanz param= new Humanz();
        param.popu=8000000;
        System.out.println(Humanz.popu);
        message(chaitra);

    }

    static void message(Humanz human){
        System.out.println(human.age);
       //System.out.println(this.age);  //--- cant write this as its static
    }
}

class Humanz{
    int age=99;
    String name;
    double salary;
    boolean married;

    static double popu= 7000000;

    Humanz(int age , String name , double salary , boolean married){
        this.age= age;
        this.name= name;
        this.salary=salary;
        this.married=married;
    }
    Humanz(){
        this.age= 0;
        this.name= "default";
        this.salary=60000;
        this.married=false;
    }


}
