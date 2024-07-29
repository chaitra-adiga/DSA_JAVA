package oops6_Object_cloning;

public class Human implements Cloneable{
    String  name ;
    int age ;
    int[] arr;

    public Human(String name ,int age){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,3,5,7,8};
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        //return super.clone(); //shallow copy
        Human twin = (Human)super.clone();// shallow
        //making a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }


}
