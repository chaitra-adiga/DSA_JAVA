package oops3_Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(){
        super();
        this.cost=-1;
    }

    BoxPrice(double side,String colour,double weight, double cost){
        super(side,colour,weight);
        this.cost=cost;
    }
}
