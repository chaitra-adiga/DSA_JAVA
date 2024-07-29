package oops3_Polymorphism;

public class Object_print {
    int num;
    @Override //by default every class extends object class so its overriding the method toString
    public String toString(){
        return (" "+ num);
    }//java @ runtime it'll determine this one to use
    public Object_print(int num){
        this.num= num;
}

    public static void main(String[] args) {
        Object_print obj = new Object_print(67);
        System.out.println(obj); //it'll not show above method because at runtime it'll decide
//println will call internally value of function , which internally calls to string method in format of
        //since our class has no obj.toString method it'll call default one
        // as every class is a sub/child class og Object class it'll use its to string method
//   public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    } so output is ----- oop_Polymorphism.Object_print@4dd8dc3
        // now if we provide a to string method it'll use that
    }
}
