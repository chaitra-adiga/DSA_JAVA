package OOPs_2;

public class Main {
    public static void main(String[] args) {
       // Singleton obj = new Singleton();
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    }
}
