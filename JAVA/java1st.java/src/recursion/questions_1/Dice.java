package recursion.questions_1;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice_comb("",2);
        System.out.println(dice_com_list("",4));
    }

    static void dice_comb (String p, int target){
        //base
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i<=6 && i<=target; i++) { //it's a dice - range is upto 6
            dice_comb(p+i,target-i);
        }
    }

    static ArrayList<String> dice_com_list(String p, int target){
        ArrayList<String> ans= new ArrayList<>();
        //base
        if(target==0){
           ans.add(p);
           return ans;
        }
        for (int i = 1; i <=6 && i<=target; i++) { // a normal die has 6 faces that is why 6
            ans.addAll(dice_com_list(p+i,target-i));
        }
        return ans;
    }

    static void dice_comb_face (String p, int target,int face){
        //base
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i<=face && i<=target; i++) { //it's a dice - range is upto 6 or face
            dice_comb_face(p+i,target-i,face);
        }
    }
}
