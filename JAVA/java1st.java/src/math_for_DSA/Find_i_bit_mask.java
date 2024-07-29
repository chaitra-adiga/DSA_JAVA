package math_for_DSA;

public class Find_i_bit_mask {
    public static void main(String[] args) {
        int num = 10110110;
        int n = 3;//ith bit
        int mask = 1<<n-1;
        int ans = num &mask;
        System.out.println(ans>>n-1);
    }
}
