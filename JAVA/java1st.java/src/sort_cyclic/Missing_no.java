package sort_cyclic;



public class Missing_no {
    public static void main(String[] args) {
        int[] arr={3,0,2,1};
        System.out.println(answer(arr, 4));

    }
    static int answer(int [] arr,int n){
        int i=0;
        while(i<n){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[correct]!= arr[i]){
                swap(arr,correct,i);
            }
            else
                i++;

        }
        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!= index)
                return index;
            //case 1
        }
        //case 2
        return n;
    }
    static void swap(int[] arr, int first,int last){
        int temp= arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
