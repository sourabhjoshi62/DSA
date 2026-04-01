class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxsum = 0;
        int n = cardPoints.length;
        for(int i=0;i<k;i++){
            maxsum += cardPoints[i];
        }
        int sum = maxsum;
        int idx = k-1;
        int end = n-1;
        while(idx>=0){
            sum += cardPoints[end];
            sum -= cardPoints[idx];
            idx--;
            end--;
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
    }
}