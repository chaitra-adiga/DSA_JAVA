package conditions;
import java.util.Scanner;

public class Switchdemo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter integer: ");
        int emp= in.nextInt();
        switch (emp){
            case 1 :
            System.out.println("kunal");
            break;
            case 2:
            System.out.println("rahul");
            break;
            case 3:
                System.out.println("enter dept no.");
                int dept=in.nextInt();
                switch (dept) {
                    case 1 -> System.out.println("IT");
                    case 2 -> System.out.println("Manag");
                    case 3 -> System.out.println("com");
                    default -> System.out.println("Enter valid dept. no");
                }




//            case 3:
//                System.out.println("enter dept no.");
//                int dept=in.nextInt();
//                switch (dept){
//                    case 1 :
//                        System.out.println("IT");
//                        break;
//                    case 2:
//                        System.out.println("Manag");
//                        break;
//                    case 3:
//                        System.out.println("com");
//                        break;
//
//                    default:
//                        System.out.println("Enter valid dept. no");
//                }


            default:
                System.out.println("-");

        }
    }



}
