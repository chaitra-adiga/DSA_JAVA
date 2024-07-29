package math_for_DSA;

public class Find_unique {
    public static void main(String[] args) {
        int[] arr ={2,3,6,4,3,4,2};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
        int unique=0;

        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }
}
