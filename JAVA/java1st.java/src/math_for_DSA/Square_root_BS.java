package math_for_DSA;

public class Square_root_BS {
    static int mid=0;
    public static void main(String[] args) {
        int n=50;
            System.out.println(sqrt(n));
    }

    public static int sqrt(int n){
        int start=0;
        int end=n;

        for (int i = 0;start<=end; i++) {
            mid=start+(end-start)/2;
            if(mid*mid == n)
                return mid;
            else if (mid*mid<n) {
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return -1;
    }

}
