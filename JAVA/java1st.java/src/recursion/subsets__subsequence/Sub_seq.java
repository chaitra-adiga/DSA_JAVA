package recursion.subsets__subsequence;

import java.util.ArrayList;

public class Sub_seq {
    public static void main(String[] args) {
        String ip ="abc";
       //subseq_generator("",ip);
        System.out.println(subseq_ascii("",ip));
    }

     static void subseq_generator(String p, String up) {
        //base
         if(up.isEmpty()){
             System.out.print(p+" ");
             return;
         }
         subseq_generator(p+up.charAt(0),up.substring(1));//take it
         subseq_generator(p,up.substring(1)); //ignore it
     }

     //arraylist
    static ArrayList<String> subseq (String p , String up){
        //base
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String> ();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> left= subseq(p+ch,up.substring(1));
        ArrayList<String> right=subseq(p,up.substring(1));

        left.addAll(right);
        return left;

    }


    static ArrayList<String> subseq_ascii (String p , String up){
        //base

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String> ();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> first= subseq_ascii(p+ch,up.substring(1));
        ArrayList<String> second=subseq_ascii(p,up.substring(1));
        ArrayList<String> third= subseq_ascii(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }


}
