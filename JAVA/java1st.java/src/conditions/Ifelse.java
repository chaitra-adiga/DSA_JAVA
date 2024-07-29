package conditions;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        /*
            if is conditional checking(true) and else (false part)
            syntax:-
                if(boolean exp){
                    body
                    }
                 else{
                 }
         */
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your salary to avail knowledge about Bonus :-");
        int sal=ip.nextInt();
        if(sal>=10000){
            System.out.println("You avail a bonus of 2000/- rupees");
            sal=sal+2000;
            System.out.println("Your total amount is :- "+sal);
        }
        else if (sal<10000) {
            //sal<=10000 it considers 1st allocated condition - thereby 2k bonus is given
            System.out.println("You avail a bonus of 1000/- rupees");
            sal=sal+1000;
            System.out.println("Your total amount is :- "+sal);

        }
        else{
            System.out.println("Please enter a valid amount ");
        }

    }
}
