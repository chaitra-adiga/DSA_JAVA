package String_basics;

public class Demo {
    public static void main(String[] args) {
        String name="Chaitra";
        System.out.println(name);
        String a="ghoru";
        String b="ghoru";
        System.out.println(a==b);
        //true in the above case;

        String a1= new String("hola");
        String a2= new String("hola");
        System.out.println(a1==a2);   System.out.println();
        //false for above case
        System.out.println(a1.equals(a2));
        //trueee
    }
}
