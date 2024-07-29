package linear_search;

import java.util.Scanner;

public class Search_in_range {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter no. of elements :- ");
        int n= ip.nextInt();
        System.out.println("Enter array elements :- ");
        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=ip.nextInt();

        }
        System.out.print("Enter key element to be found :- ");
        int key= ip.nextInt();
        System.out.print("Enter the starting of range :- ");
        int s = ip.nextInt();
        System.out.print("Enter the ending of range :- ");
        int e = ip.nextInt();


        int ans =ls_range(arr,key,s,e);
        if(ans==-1){
            System.out.println("Invalid search! Re-enter ");
        }
        else{
            System.out.println("The element was found at index no. "+ ans +" ,in range from "+ s+ " to "+e);
        }


    }

     static int ls_range(int[] arr, int key, int start, int end) {
        if(arr.length==0)
            return -1;

         for (int i = start; i<= end ; i++) {
             if (key==arr[i])
                 return i;

         }
         return -1;
    }
}
