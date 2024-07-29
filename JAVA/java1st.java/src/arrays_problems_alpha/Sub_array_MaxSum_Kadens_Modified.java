package arrays_problems_alpha;

public class Sub_array_MaxSum_Kadens_Modified {
    public static void main(String[] args) {
        //int[] arr= {-2,-1,-4,-3};
        //int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr={5,4,-1,7,8};
        System.out.println("Maximum sum of sub array is "+ kadens_mod(arr));
    }
    static int kadens_mod(int[] arr){
        int localmax=Integer.MIN_VALUE;
        int globalmax=Integer.MIN_VALUE;
        if(arr.length==1){
            return arr[0];
        }

        for (int i = 0; i < arr.length; i++) {

            int cur = arr[i];
            localmax= Math.max((localmax+cur),cur);
            globalmax= Math.max(globalmax,localmax);
        }
        return globalmax;
    }
}
