package oops5_interfaces.extends_demo2;

public interface A {
    default void greet() {
        System.out.println("I'm in A interface");
    }

    static void staticmethod(){
        System.out.println("This is static method");
    }
}
