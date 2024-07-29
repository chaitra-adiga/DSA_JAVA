package oops4_access;

public class Main {

    public static void main(String[] args) {
        A obj = new A(10, "Kunal");
            // need to do a few things
            // 1. access the data members
            // 2. modify the data members

//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(list.size);


        obj.getNum();
        int n = obj.num;

        }
}

/*
            │ Class │ Package │ Subclass │ Subclass │ World
            │       │         │(same pkg)│(diff pkg)│(diff pkg & not subclass)
────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
public      │   +   │    +    │    +     │     +    │   + ||when u want to access anywhere
────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
protected   │   +   │    +    │    +     │     +    │||only subclasses could use from diff packagr
────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
no modifier │   +   │    +    │    +     │          │|| those var which u don't want to use outside that package
────────────┼───────┼─────────┼──────────┼──────────┼──────────────────────────
private     │   +   │         │          │          │|| sensitive data - u can access this via getter n setter


*/
