package oops5_abstract_classes;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.carrier("emgineer");
        son.partner("Chaitra ",21);

        Daughter beti = new Daughter(21);
        beti.carrier("bussiness");
        beti.partner("ghoru ",23);

       // Parent mom = new Parent() ; --- ERROR ---'Parent' is abstract; cannot be instantiated

        son.non_static_hello();
        Son.hello();

        Parent daughter = new Daughter(16);
        //we can do it , using parent as r.v for type of object daughter(subclass)
        daughter.carrier("Singer");
        daughter.partner("dancer",18);
    }

}
