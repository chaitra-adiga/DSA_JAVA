package linear_search;

public class min_max_no {
    public static void main(String[] args) {
        int[] arr={2,34,5432,234,65676,685,212,21,1,34,-9};
        System.out.println("Taken array is :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
        System.out.println("minimum is "+ls_min(arr));
        System.out.println("maximum is "+ls_max(arr));


    }
    static int ls_min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }

    static int ls_max(int[] arr){
        int max= arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }

        }
        return max;
    }
}
