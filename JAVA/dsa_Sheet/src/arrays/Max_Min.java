package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the number of elements :- ");
        int n= i.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array elements :-");
        for (int j = 0; j < arr.length; j++) {
            arr[j]=i.nextInt();

        }
        System.out.println("Your array is :- ");
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>max){
                max=arr[j];
            }

        }
        System.out.println("The maximum of array is  "+ max);

        int min=arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<min){
                min=arr[j];
            }

        }
        System.out.println("The minimum of array is  "+ min);

    }
}
