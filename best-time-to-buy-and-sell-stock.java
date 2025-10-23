class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i< prices.length; i++){
            // checks for the min value = buy(after the min value,there should be big value, it was sell)
            if(prices[i] < minPrice){
                minPrice = prices[i];

            }
            // checks max value near to min and difference should greater than profit
            else if (prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
    
}
