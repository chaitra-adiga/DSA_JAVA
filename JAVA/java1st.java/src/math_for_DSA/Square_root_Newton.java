package math_for_DSA;

public class Square_root_Newton {
    public static void main(String[] args) {
        int n=40;
        System.out.println(sqrt(n));

    }
    public static double sqrt(int n){
        double root=0.0;
        double x=n;
        while(true){
            root= 0.5 *(x+n/x);
            if(Math.abs(root -x)<=0.5){
                break;
            }
            x=root;
        }
        return root;
    }
}
