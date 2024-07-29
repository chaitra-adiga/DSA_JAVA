package OOPs_2;

public class StaticBlock {
    static int a= 6;
    static int b;
    static String c;

    static {
        System.out.println("This block is only executed once where initialisation could be done");
        b= a*5;
        c="ghoruuuu";
        System.out.println("out from static block");
    }

    public static void main(String[] args) {
        //StaticBlock obj = new StaticBlock();
        System.out.println(b);
        //System.out.println(StaticBlock.b+" "+StaticBlock.c+" "+StaticBlock.a);

        StaticBlock.b+=3;
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.b+" "+StaticBlock.c+" "+StaticBlock.a);
    }
//    StaticBlock(){
//        StaticBlock.b=9;
//    } can do this to
}
