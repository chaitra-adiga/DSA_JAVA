package conditions;
import java.util.Scanner;
public class Maxof3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three integers a,b,c ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        int max=a;
        if(max<b){
            max=b;
        }
        else if(max<c) {
            max=c;
        }

        System.out.print("Maximum of three is "+max);

    }
}
