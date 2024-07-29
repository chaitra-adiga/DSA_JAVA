package oops3_Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(BoxWeight other){
        /*this is exactly like
        *  Box box3= new BoxWeight(4,5.6,7.9,56); as super(other) is box type constructor
        * then we initialise the new weight one here in this constructor */
       super(other); //imagine box inplace of super , it calls parent constructor 1st .
        weight= other.weight; //weight of new box will be equal to weight of other box
    }
    //here we have done super of other
    BoxWeight(double l, double w, double h,String colour, double weigh,double weight){
        super(l, w, h,colour,weigh);//if this constructor isn't used then default one will be called
        //here even if we did l as private it didn't give an error
        // because l is initialised by parent class ! --- only thing is u cant access it
        // cant access like this.l even here & even in main class

       // super.weight= weight;//this is box/parent class ka weight
        this.weight= weight;//this boxweight object ka weight
        //this.w = 2; --- yes u can do it
        //this.l = 8; --- can't do this -- its private
    }
    // even though child can access all the members of parent class/super
    // it can not access private member of parent class

    BoxWeight(double side,String our,double weight){
        super(side,our);
        this.weight=weight;
    }



}
