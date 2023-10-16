class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        int j = 0;

        while(j < prices.length){
            if(prices[i] > prices[j]){
                i = j;
            }
            else{
              profit = Math.max(profit, prices[j]-prices[i]);

            }
            j++;
        }

        return profit;


    }
}