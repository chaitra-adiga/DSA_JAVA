package recursion.questions_1;

import java.util.ArrayList;

public class Phone_pad {
    public static void main(String[] args) {
        phone_seq("","34");
        System.out.println(phone_seq_list("","32").size());
        System.out.println(phone_seq_count("","12"));
    }

    static void phone_seq(String p, String up){
        //base
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

       int dig = up.charAt(0)-'0'; // this converts '2' to 2 as '0'= 48(ascii) thereby '2'=(50-28)ascii=2int
        int range_start= (dig-1)*3;
        int range_end = dig*3;
        for (int i = range_start; i <range_end; i++) {
            char ch= (char)('a'+i);

            phone_seq(p+ch,up.substring(1));
        }

    }

    static ArrayList<String> phone_seq_list(String p, String up){
        ArrayList<String> ans= new ArrayList<>();
        //base
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }

        int dig = up.charAt(0)-'0';
        for (int i = (dig-1)*3; i <dig*3 ; i++) {
            char ch = (char)('a'+i);
             ans.addAll(phone_seq_list(p+ch,up.substring(1)));
        }
        return ans;
    }

    static int phone_seq_count(String p, String up){
        //base
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int dig = up.charAt(0)-'0';
        for (int i = (dig-1)*3; i <dig*3; i++) {
            char ch= (char)('a'+i);
            count= count+phone_seq_count(p+ch,up.substring(1));
        }
        return count;
    }
}
