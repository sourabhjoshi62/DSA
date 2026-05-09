class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min = prices[0];
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<=min){
                min = prices[i];
            }else{
                max_profit = Math.max(max_profit,prices[i]-min);
            }

        }
        return max_profit;
        
    }
}