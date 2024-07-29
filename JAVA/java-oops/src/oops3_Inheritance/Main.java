package oops3_Inheritance;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Box has dimensions :");
//        Box box1 = new Box(4.0,5.9,7.8,"Red");
//        System.out.println(box1.w+" "+box1.h+" "+box1.colour);//parent can't access child class
        //property weight only child can access + box1.l cant be accessed as its private
//        BoxWeight boxsm = new BoxWeight(3.4,5.6,7.9,"Yellow",45,98);
//        System.out.println("Child colour "+ BoxWeight.colour); //we must call static by class name
       // System.out.println("parent colour "+box1.colour);
       // System.out.println("child weight "+ boxsm.weight+"parent class "+box1.weight);


//        BoxWeight nayasa = new BoxWeight(23.4,45.3,67.4,"hara rang",78.6,89);
//        System.out.println(nayasa.weigh);
//        System.out.println(nayasa.weight);

/*
* child can change parents static members permanently
*in above example red was changed to yellow by parent  */


//        Box box2= new Box(box1);
//        System.out.println(box2.l+" "+box2.w+" "+box2.h+" "+box2.hashCode());

//        BoxWeight box3= new BoxWeight();
//        System.out.println(box3.l+" "+box3.w+" "+box3.h+" "+box3.weight+" "+box3.hashCode());

        //but if I do without using super keyword ,want to pass l,w,h,weight it would show error
    // BoxWeight box4 = new BoxWeight(1,2,3,5); //error statement -Expected 0 arguments but found 4

        //after super keyword
//        BoxWeight box3= new BoxWeight(4,5.6,7.9,56);
//        System.out.println(box3.colour);
//        System.out.println(/*box3.l+" "+*/box3.w+" "+box3.h+" "+box3.weight+" "+box3.hashCode());
//
//        Box box5 = new BoxWeight(4,5,7,9);
//        System.out.println(box5.w+" "+box5.weight);
// it's the type of reference variable , here box5 it's of parent class box type
        // its actually the type of reference variable not the type of object that determines
        //what members can be accessed
//even though weight is initialised but it cant be accesed as r.v. is of parent type


//        BoxWeight box6 = new Box(4.5,3.4,5.4);
// box 6 is invalid


//       BoxWeight box6= new BoxWeight(box3);
    }




}
