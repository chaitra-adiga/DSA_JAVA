package oops2_static_example;

public class Explaination_static {
    static int my_num; //class variable
    //constructor
    public Explaination_static(int num){
        Explaination_static.my_num = num;
    }

    public static int getMy_num(){
        return my_num; //class variable
    }

    public static void main(String[] args) {
        // Creating the first object of MyClass with value 10
       Explaination_static obj1 = new Explaination_static (10);
        System.out.println("My number for obj1 is: " + Explaination_static .getMy_num());
        // Output: My number for obj1 is: 10

        // Creating the second object of MyClass with a different value 20
        Explaination_static  obj2 = new Explaination_static (20);
        System.out.println("My number for obj2 is: " + Explaination_static .getMy_num());
        // Output: My number for obj2 is: 20

        // Accessing myNumber directly through the class
        System.out.println("My number through class: " + Explaination_static .my_num);
        // Output: My number through class: 20

        System.out.println(Explaination_static.getMy_num());
        System.out.println(Explaination_static.my_num);
    }
}
