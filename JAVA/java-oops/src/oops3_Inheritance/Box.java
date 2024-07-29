package oops3_Inheritance;

public class Box {
    private double l; //--- you can do whatever you want with private but only in this class
    //like you can set it , define it but only here
    //double l;
    double w;
    double h;
    
    double weigh=98.6;
    static String colour="green";


    //creating multiple constructors
    Box(){ //default values
        this.l=-1;
        this.w=-1;
        this.h=-1;
        String colour1 = Box.colour;
    }

    Box(double side,String colour){ //cube
        this.l=side;
        this.w=side;
        this.h=side;
        Box.colour=colour;
    }

    Box(double l,double w , double h,double weigh){ //normal box
        this.l=l;
        this.w=w;
        this.h=h;
        this.weigh = weigh;
    }

    Box(Box oldBox){ //copying old box to new box
        this.l= oldBox.l;
        this.w= oldBox.w;
        this.h= oldBox.h;
    }

    public Box(double l, double w, double h, String colour,double weigh) {
        this.l=l;
        this.w=w;
        this.h=h;
        Box.colour = colour;
        this.weigh = weigh;
    }
}
