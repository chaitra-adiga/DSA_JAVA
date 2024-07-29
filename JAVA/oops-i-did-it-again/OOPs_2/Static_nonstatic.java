package OOPs_2;

public class Static_nonstatic {
    public static void main(String[] args) {
        Static_nonstatic obj = new Static_nonstatic();
        obj.greeting();
    }
    void greeting(){
        System.out.println("hello, ami non static ");
        aajaye();
    }

    static void fun(){
        Static_nonstatic obj = new Static_nonstatic();
        obj.greeting();//obj is not same as main ka obj as scope is over
        //greeting(); ----> non static
        obj.aajaye();
    }

    void aajaye(){
        greeting();
        fun();

    }
}

