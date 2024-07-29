package recursion.Intro;

public class Recursion_fib_BS {
    public static void main(String[] args) {
       // print(1);
        //System.out.println(fibo(7));
        for (int i = 1; i < 11; i++) {
            System.out.println(fiboformula(i));
        }
        System.out.println(fiboformula(50));
    }
    static int fiboformula(int n){
        //return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n) )/Math.sqrt(5)); //less dominating removed
        //just for demo use long instead
    }
    static void print(int n){
        if(n==50){
            System.out.println(n);
            return;
        }//base condition
        System.out.println(n);
        print(n+1);//-----> last statement to be executed
    }
    //tail recursion

    static int fibo(int n){
        if(n<=1){
            return n;
        } //base condition
        return fibo(n-1)+fibo(n-2);//recurance relation
    }
}
