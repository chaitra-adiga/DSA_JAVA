package math_for_DSA;

public class Power_of_2 {
    public static void main(String[] args) {
        int n = 3; //note : n=0 is exception case
       /*int ans = n & n-1;
        if(ans==0){
            System.out.println("its a power of 2!");
        }else
            System.out.println("its not a power of 2!");*/
        boolean ans = (n&(n-1))==0; //smart way
        System.out.println(ans);
    }
}
