package linear_search;

import java.util.Arrays;

public class Max_wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,9},
                {1,9,7},
                {4,8,6}
        };
        System.out.println("The array taken is :- ");
        //System.out.println(Arrays.toString(accounts));
        System.out.println("max wealth is with "+maximumWealth(accounts));


    }
    static int maximumWealth(int[][] accounts) {

        int max=0;
        for (int customer = 0; customer < accounts.length; customer++) {
            int sum=0;
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                sum=sum+accounts[customer][bank];

            }
            if(sum>max)
                max=sum;


        }
        return max;

    }
}
