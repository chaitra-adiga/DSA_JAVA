package arrays_problems_alpha;

//public class Trapping_rainWater {
//    public static void main(String[] args) {
//        int arr[]={4,2,0,6,3,2,5};
//        System.out.println(volume_of_rainWater(arr));
//    }
//    static int volume_of_rainWater(int[] arr){
//        int high= max_inarr(arr);
//        int[] arr1 ;
//        int[] arr2 ;
//        for (int i = 0; i < high; i++) {
//           arr1 = new int[]{arr[i]};
//        }
//        for (int i = high+1; i < high; i++) {
//            arr1 = new int[]{arr[i]};
//        }
//
//        = new int[]{ high+1,arr.length-1};
//
//        int max1= max_inarr_val(arr1);
//        int max2 = max_inarr_val(arr2);
//        int arr1sum=0 , arr2sum=0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1sum= arr[max1]-arr[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            arr2sum= arr[max2]-arr[i];
//        }
//
//        //int total_volume = arr1sum+arr2sum;
//
//        //return total_volume;
//        return arr1sum+arr2sum;
//    }
//
//   static int max_inarr(int[] arr) {
//        int max=arr[0];
//        int in =0;
//       for (int i = 1; i < arr.length; i++) {
//           if (arr[i] > max) {
//               max = arr[i];
//               in = i;
//
//           }
//       }
//       return in;
//    }
//    static int max_inarr_val(int[] arr) {
//        int max=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//}




public class Trapping_rainWater {
    public static void main(String[] args) {
        //int arr[]={4,2,0,6,3,2,5};
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(trappedRainWater(arr));
    }
    static int trappedRainWater(int[] height ){
        int n= height.length;;
        //calculate left max
        int[] left_max= new int[height.length];
        left_max[0]=height[0];
        for (int i = 1; i < left_max.length; i++) {
            left_max[i]= Math.max(height[i],left_max[i-1]);
        }
        //calculate right max
        int[] right_max= new int[n];
        right_max[n-1]=height[n-1];
        for (int i = n-2; i >=0; i--) {
            right_max[i]= Math.max(height[i],right_max[i+1]);
        }
        //loop
        int water_level=0;
        int trapped_water=0;

        for (int i = 0; i < height.length; i++) {
            //calc min. of [left,right]max == water level
            water_level= Math.min(left_max[i],right_max[i] );
            //calculate trapped rain water
            //trapped rain water= water level - height of bar
            trapped_water+=water_level-height[i];

        }
        return trapped_water;
    }
}

