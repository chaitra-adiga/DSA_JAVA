package binary_search;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr={1,3,3,4,5,16,19,23,27,100,200,300,400,500,600,700,900,1001};
        int tar=23;
        System.out.println(ans(arr,tar));
    }

    static int ans(int[] arr, int tar){
        int start=0;
        int end =1;

        while(arr[end]<tar){
            //keep doubling the chunk
            int newstart=end+1;
            //end = previous end+ chunk size*2
            end= end+ (end-start+1)*2;
            start=newstart;
        }

        return binary_search(arr,tar,start,end);
    }

     static int binary_search(int[] arr, int tar, int start, int end) {
         while(start<=end) {
             int mid =(start+end)/2;
             if(tar>arr[mid])
                 start=mid+1;
             else if (tar<arr[mid]) {
                 end=mid-1;
             }
             else
                 return mid;
         }
         return -1;
    }
}
