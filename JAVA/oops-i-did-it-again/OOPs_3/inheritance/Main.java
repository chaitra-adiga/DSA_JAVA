package OOPs_3.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box = new BoxWeight();
        box.greeting();
        BoxWeight.greeting(); // you can inherit but you cannot override
    }
}
