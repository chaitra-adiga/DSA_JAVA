package math_for_DSA;

public class Odd_even {
    public static void main(String[] args) {
        System.out.println(isOdd(-98));
    }//way more efficient - tells for negative no. also

    private static boolean isOdd(int i) {
        return (i&1) == 1;
    }
}
