package recursion.easy;

public class Product_of_digs {
    public static void main(String[] args) {
        int n=1324;
        System.out.println(product(n));
    }

    public static int product(int n){
        if(n%10 ==n){
            return n;
        }
        int nw = n/10;
        return (n%10)*product(nw);
    }
}
