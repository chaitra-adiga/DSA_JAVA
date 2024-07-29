package linear_search;

import java.util.Arrays;

public class Even_digs {
    public static void main(String[] args) {
        System.out.println("The array taken is :- ");
        int[] nums = {312, 45897898, 2, 6,84975,9324815,40958045,-23 ,7896};
        System.out.println(Arrays.toString(nums));
        int ans =find_even(nums);
        System.out.println("no. of digs having even dig is "+ans);

    }
    static int find_even(int[]nums){
        int count =0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }

    static boolean even(int num){
        int c=no_of_digs(num);
        if(c%2==0)
            return true;
        return false;
    }

    static int no_of_digs(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
