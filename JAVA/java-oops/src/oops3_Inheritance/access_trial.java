package oops3_Inheritance;
import oops4_access.A;

public class access_trial {
    A obj = new A(12,"Suru");
    //obj.num;
    String v = obj.name;
  //int be = obj.arr; //ERROR = 'arr' is not public in 'access.A'. Cannot be accessed from outside package

}
