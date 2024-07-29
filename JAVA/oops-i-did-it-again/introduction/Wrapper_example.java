package introduction;

public class Wrapper_example {
    public static void main(String[] args) {
        int a =11;
        int d = 12;
        swap_primi(a,d);
        System.out.println(a+" "+d);
        Integer b = 15;
        System.out.println(b.compareTo(a));
        Integer c=30;
        swap(b,c);
        System.out.println(b+" "+c);

    }
    static void swap(Integer a, Integer b){
        Integer temp =a;
        a=b;
        b=temp;
    }

    static void swap_primi(int a , int b){
        int temp =a;
        a=b;
        b=temp;

    }
}
