package arrays_problems_alpha;

public class Sub_array_MaxSum {
    public static void main(String[] args) {
        //int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        //int[] arr= {1,-2,6,-1,3};
        int[] arr= {-2,-3,4,-1,-2,1,5,-3};
        //System.out.println("Maximum sum of sub array is "+max_subarray_bruteForce(arr));
        //System.out.println("Maximum sum of sub array is "+max_subarray_prefixSum(arr));
        System.out.println("Maximum sum of sub array is "+ max_subarray_kadensAlg(arr));
    }
    static int max_subarray_bruteForce(int[] arr ){

        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = 0; j < arr.length; j++) {
                int sum=0;
                int end=j;
                for (int k = start; k <= end; k++) {
                    sum+=arr[k];

                }
                if(sum>max){
                    max=sum;
                }

            }

        }
        return max;

    }


    static int  max_subarray_prefixSum(int[] arr ){
        int max= Integer.MIN_VALUE;
        int[] prefix= new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]= prefix[i-1]+arr[i];
        }
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            int start =i;
            for (int j = 0; j < arr.length; j++) {
                int end =j;
                sum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                // if start is 0 , then 0-1 =-1 ; index out of bound
                // start=0 i.e the sum is already calculated at vey first instance
                //when we calculated prefix array .
                //just calculate once prefix array u will know
            }
            if (sum > max) {
                max=sum;
            }

        }
        return max;
    }

    //kadens algorithm [shradha didi ]

    static int max_subarray_kadensAlg(int[] arr ){
        int cs=0;
        int ms= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs+= arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);

        }
        return  ms;
    }
}
