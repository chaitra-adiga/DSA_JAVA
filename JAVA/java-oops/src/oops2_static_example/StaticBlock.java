package oops2_static_example;

// this is a demo to show initialisation of static variables

public class StaticBlock {
    //as soon as the class is loaded all the static elements are loaded first

        static int a = 4;
        static int b;

        // will only run once, when the first obj is created
        // i.e. when the class is loaded for the first time
        static {
            System.out.println("I am in static block");
            b = a * 5;
        }

        public static void main(String[] args) {
            StaticBlock obj = new StaticBlock();
            System.out.println(StaticBlock.a + " " + StaticBlock.b);

            StaticBlock.b += 3;

            System.out.println(StaticBlock.a + " " + StaticBlock.b);

            StaticBlock obj2 = new StaticBlock();
            System.out.println(StaticBlock.a + " " + StaticBlock.b);
            //when 2nd obj is created it didn't run the static because that only runs once
            //but why would it be loaded 2nd time if a new object is created?
            //I still didn't get what's so big about a and b variable when they can be changed also
            //why are they called by class name in print statement
        }

    }

