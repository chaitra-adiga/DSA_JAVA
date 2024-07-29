package recursion.easy;

public class No_of_steps_1342 {
    public static void main(String[] args) {
        int n =14;
        System.out.println(steps(n));
    }
    public static int steps(int n){
        return helper1(n,0);
    }
    public static int helper1(int n , int s){
        if(n==0){
            return s;
        }
        if(n%2==0){
            return helper1(n/2,s+1);
        }
        return helper1(n-1,s+1);
    }
}
