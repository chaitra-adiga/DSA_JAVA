package Problems;

public class Prob_1295 {
    public static void main(String[] args) {
        int[] nums={5555,901,482,1771};
        System.out.println(find_even(nums));
    }
    public static int find_even(int[] nums){
        int count=0;
        for(int num : nums){
         if(iseven(num)){
             count++;
         }
        }
        return count;
    }

    public static boolean iseven(int num){
        int c = no_of_digs(num);
        if(c%2 == 0){
            return true;
        }
        else
            return false;
    }
    public static int no_of_digs(int num){
        int count=0;
        while (num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
