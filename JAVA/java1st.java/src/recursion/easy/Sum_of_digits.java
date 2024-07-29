package recursion.easy;

public class Sum_of_digits {
    public static void main(String[] args) {
        int n=1324;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n%10 ==0){
            return 0;
            /* if(n%10 ==n){
                    return n; ------- even this would work
            }*/
        }
        int nw = n/10;
        return (n%10)+sum(nw);
    }
}
