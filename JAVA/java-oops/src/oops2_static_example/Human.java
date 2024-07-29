package oops2_static_example;

public class Human {
    //class Human ka properties
    //template

        int age;
        String name;
        int salary;
        boolean married;
        static long population;


        static void message(){
            System.out.println("Hello ");
            //System.out.println(this.age); ----- can't use this as
            //static methods don't depend on objects/instances
            //and this is object thing
        }


        public Human(int umar,String name,int salary, boolean married){
            //CONSTRUCTOR
            this.age=umar;
            //name=name------ error ---- it cant identify n says that variable is assigned to itself
            this.name= name;
            this.salary=salary;
            this.married= married;
            Human.population +=1;

        }

}
