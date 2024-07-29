package recursion.easy;

public class Sum_AP {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n){
        if(n <=1){//here i need to return 1 as it's not product but summation
            return n;
        }
        return n+sum(n-1);
    }
}
