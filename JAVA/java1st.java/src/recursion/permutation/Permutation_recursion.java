package recursion.permutation;

import java.util.ArrayList;

public class Permutation_recursion {
    public static void main(String[] args) {
       // rec_per("","abc");
        ArrayList<String> answer = permutation_list("","abc");
        System.out.println(answer);
    }

    static void rec_per(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s = p.substring(i,p.length());
            rec_per(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutation_list(String p , String up){
        //local to this call
        ArrayList<String> ans = new ArrayList<>();
        //base
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f= p.substring(0,i);
            String s=p.substring(i,p.length());
             ans.addAll(permutation_list(f+ch+s,up.substring(1)));
        }
        return ans;
    }

}
