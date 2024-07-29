package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class eg {
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
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        System.out.println("After Reversing " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

