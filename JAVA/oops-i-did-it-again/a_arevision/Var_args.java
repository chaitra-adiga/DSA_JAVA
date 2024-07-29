package a_arevision;

import java.util.Arrays;
public class Var_args {
    public static void main(String[] args) {
        fun("wq","lkfn","nrfk","vbn");
        multiple_kind(12,44,"ghoru","ghoree","ogo","shoor","amar");
    }
    static void fun(String ...args){
        System.out.println(Arrays.toString(args));
        System.out.println(args[0].charAt(0));
    }

    static void multiple_kind(int a , int b , String ...arg/*,int c*/){
        //Vararg parameter must be the last in the list
        System.out.print(a+" "+b);
        System.out.println(Arrays.toString(arg));
    }
}
