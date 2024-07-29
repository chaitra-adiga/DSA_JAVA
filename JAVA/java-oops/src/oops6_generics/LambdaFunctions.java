package oops6_generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        //arr.forEach(item -> System.out.println(item*2));
        //item repr every single element in arraylist
        Consumer<Integer> fun = (item -> System.out.println(item*2));
        arr.forEach(fun);

        Operations sum = (a,b) -> a+b;
        Operations sub = (a,b) -> a-b;
        Operations mul = (a,b) -> a*b;
        Operations div = (a,b) -> (a/b);

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(5,3,sum));
        System.out.println(myCalc.operate(5,3,sub));
        System.out.println(myCalc.operate(5,3,mul));
        System.out.println(myCalc.operate(5,3,div));

    }

//    int sum(int a , int b){
//
//        return a+b ;
//    }


    int operate(int a , int b , Operations op){
        return op.operations(a,b);
    }
}

//for multiple parameter
interface Operations{
    int operations(int a, int b);
}