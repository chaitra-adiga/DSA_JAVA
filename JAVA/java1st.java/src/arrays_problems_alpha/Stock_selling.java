package arrays_problems_alpha;

public class Stock_selling {
    public static void main(String[] args) {
        int[] prices={1,2,3,4,5};
        System.out.println(profit(prices));

    }


    // ------- MY APPROACH ------ //
    static int profit(int[] prices){
        //profit = selling price - buying price
        // buy price min.
        int profit=0 ;
        int buy=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<buy){
                buy=prices[i]; // min. value of array
            }
        }

        //after buying price find the selling price = max
        int n= buying_price(prices); // this will give min. value's index
        if(n!=prices.length-1){ //what if the the min value is at last index
            //after which -- n+1 will be index out of bound
            int sell= prices[n+1];
            for (int i = n+1; i <prices.length ; i++) {
                if(prices[i]>sell){
                    sell=prices[i];
                } //here selling price is calculated
            }

            if(sell>buy){ //here a check for negative profit
                profit= sell-buy;
            }

        }

        return profit;
    }

    static int buying_price(int[] prices) {
        int min= prices[0];
        int in=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<min){
                min=prices[i];
                in=i;
            }

        }
        return in;
    }
}
