package linear_search;
import java.util.Scanner;

public class ls_code {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter no. of elements ");
        int n = in.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.print("enter a key/target element:-  ");
        int tar= in.nextInt();


        int ans =  ls(arr,tar);
        System.out.println(ans);

    }

     static int ls(int[] arr, int tar) {
        if (arr.length ==0)
            return -1;

         for (int i = 0; i < arr.length; i++) {
             if(arr[i]==tar){
                 return i;
             }

         }
         //return -1;
         return Integer.MAX_VALUE;
    }
}
