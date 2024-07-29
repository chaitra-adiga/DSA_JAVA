package recursion.array;

public class Check_sorted {
    public static void main(String[] args) {
        int[] arr={1,9,3,6,9};
        //System.out.println(check_sorted(arr,0));
        System.out.println(sorted(arr,0));
    }
    //my approach!
    public static boolean check_sorted(int[] arr, int i){
        boolean flag=true;
        for (int j = 0; j < arr.length; j++) {//it will check till last index then else part is executed
            if (i<arr.length-2) {
                if (arr[i] > arr[i + 1]) {
                    flag=false;
                    return flag;//base
                }
            }
            else
                return flag;//if array is sorted
        }
        return check_sorted(arr,i+1);
    }

    //better approach
    static boolean sorted(int[] arr, int index){
        //base
        if(index==arr.length){
            return true;
        }

        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
}
