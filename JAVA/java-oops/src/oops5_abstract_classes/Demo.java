package oops5_abstract_classes;

public class Demo {

    public static void main(String[] args) {
        Chaitra.bj.print();
    }
}
//ghoru showerd how sot works with final keyword

class Param{
    void print(){
        System.out.println("Hello");
    }
}

class Chaitra{
    int a;
    String b;
    static Param bj = new Param();
    Chaitra()
    {
        this.a = 10;
        this.b = "aaaaaaaaaa";
    }

    @Override
    public String toString() {
        return "Chaitra{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    public Chaitra(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static Param getBj() {
        return bj;
    }

    public static void setBj(Param bj) {
        Chaitra.bj = bj;
    }
}
