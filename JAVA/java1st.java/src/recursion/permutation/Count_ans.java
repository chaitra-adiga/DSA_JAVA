package recursion.permutation;

public class Count_ans {
    public static void main(String[] args) {
        System.out.println(permutation_count("","abc"));
    }
    static int permutation_count(String p , String up){
        //base
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch= up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i,p.length());
            count=count+permutation_count(f+ch+s,up.substring(1));
        }
        return count;
    }
}
