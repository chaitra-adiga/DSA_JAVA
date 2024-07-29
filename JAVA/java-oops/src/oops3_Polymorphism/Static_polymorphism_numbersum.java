package oops3_Polymorphism;

public class Static_polymorphism_numbersum {
//    int sum (int a, int b){
//        return a+b ;
//    }

//        double sum(double a, int b){
//
//            return a+b;
//        }
        //a int can br turned into double but a double cant be turned into int , that is why its showing
    //error

    double sum( int a, double b){
        return a+b; //if we give return type of method as int in this method it'll show error,typecasting
    } //order
//     double sum(int a, int b){
//        return a-b; //typecasting of int into double can be done but not in reverse way
//    }

    void sum(String a,int b ){

        System.out.println(a+b);
    }
    void sum(int b,String a ){

        System.out.println(a+b);
    } //order is different

    double sum(double a, double b){

        return a-b;
    }


    public static void main(String[] args) {
        Static_polymorphism_numbersum obj = new Static_polymorphism_numbersum();
        System.out.println(obj.sum(3,4));
    }
}


//overriding depends on objects, static doesnt depend on object thatswhy static cant be overriden