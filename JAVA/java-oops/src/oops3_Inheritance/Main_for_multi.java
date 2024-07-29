package oops3_Inheritance;

public class Main_for_multi {
    public static void main(String[] args) {
        BoxPrice box9= new BoxPrice();
        System.out.println(box9.h+" "+ box9.w+" "+ box9.weigh);
        //weigh was defined in original class BOX as 98.6

        BoxPrice box0= new BoxPrice(23,"gagag",23.5,600);
        System.out.println(box0.w+ " "+box0.h+" "+box0.weight+" "+box0.weigh+" "+ box0.cost+" "+BoxPrice.colour);

        Box orig = new Box();
        System.out.println(Box.colour);

        BoxWeight diba = new BoxWeight();
        System.out.println(BoxWeight.colour);
    }
}
