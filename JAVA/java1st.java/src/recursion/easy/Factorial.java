package recursion.easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n <=2){
            return n;
        }
        return n*fact(n-1);
    }
}
