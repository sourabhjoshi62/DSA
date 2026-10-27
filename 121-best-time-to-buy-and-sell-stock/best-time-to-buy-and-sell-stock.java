class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int mpro = 0;
        for(int i:prices){
            if(i>mini){
                mpro = Math.max(mpro,i-mini);
            }
            mini = Math.min(mini,i);
        }
        return mpro;
        
    }
}