package recursion.easy;

public class Count_zeros {
    static int count=0;
    public static void main(String[] args) {
        int n=560;
      //  int n=0560; ----- Octal integer '0560' it'll convert into int viz 368 and ans is 0.
        System.out.println(count(n));
    }
    static int count_zero(int n , int c){
        if(n==0){
            return count;
        }
        else{
            if(n%10==0){
                count+=1;
            }
        }
        return count_zero(n/10,count);
    }
    //kunal way
    //SPECIAL PATTERN - how to pass a value to above calls
    public static int count(int n){
        return helper(n,0);
    }

    public static int helper(int n , int c){
        if(n==0){
            return c;
        }
        int rem= n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
