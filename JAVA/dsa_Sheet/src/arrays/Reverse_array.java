package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("Enter size of array :-");
        int n = o.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = o.nextInt();
        }
        System.out.println("Before Swaping  " + Arrays.toString(arr));
        reverse(arr, 0, arr.length - 1);
        System.out.println("After Reversing " + Arrays.toString(arr));
    }

    static void reverse(int[] arr, int i, int j) {
        for (int k = 0; k < arr.length / 2; k++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j = arr.length - i - 1;

        }

    }
}
