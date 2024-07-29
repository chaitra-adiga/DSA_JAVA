package math_for_DSA;

public class Set_bits {
    public static void main(String[] args) {
        int n =79;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbits(n));
    }

    private static int setbits(int n) {
        int count =0;
        while(n>0){
            count++;
            //n -= (n&-n);
            n = n &(n-1);
        }
        return count;
    }
}
