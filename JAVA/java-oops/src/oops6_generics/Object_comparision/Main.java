package oops6_generics.Object_comparision;

public class Main {
    public static void main(String[] args) {
        Student chaitra = new Student(26,99f);
        Student param = new Student(30,99f);
        if(chaitra.compareTo(param) < 0){
            System.out.println(chaitra.compareTo(param));
            System.out.println("param's marks are more");//other obj is bigger --- negative
        }
        if(chaitra.compareTo(param) > 0){
            System.out.println(chaitra.compareTo(param));
            System.out.println("chaitra's marks are more");//current obj is bigger--- positive
        }
        if(chaitra.compareTo(param) == 0){
            System.out.println(chaitra.compareTo(param));
            System.out.println("both are equal");//both are eql ---0
        }

    }
}
