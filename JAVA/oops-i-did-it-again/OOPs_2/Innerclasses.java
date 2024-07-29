package OOPs_2;

public class Innerclasses {
    static double salary=10000089.0;
    static class Test{//this is dependent on the class itself but not its objects
       static String name;
        int age;

        public Test(String name, int age) {
            Test.name = name;
            this.age = age;
//            salary = 1000.0;
        }
    }

    public static void main(String[] args) {
        //Test obj = new Test("Chaitra",21);
        //OOPs_2.Innerclasses.this' cannot be referenced from a static context
        Test obj = new Test("Chaitra",21);
        Test obj1 = new Test("param",22);
        System.out.println("my name is "+Test.name+" my age is "+obj.age+"my salary is "+salary);

    }
}

//static class Dekho{
// ||- Modifier 'static' not allowed here
//}
