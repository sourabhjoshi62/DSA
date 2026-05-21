class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length;//7
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += cardPoints[i];
        }
        int maxsum = sum;
        int sum1 = sum;
        //6,5,4
        int j = k-1;
        for(int i=n-1;i>=n-k;i--){
            sum1 += cardPoints[i];
            sum1 -= cardPoints[j];
            j--;
            maxsum = Math.max(maxsum,sum1);
        }
        return maxsum;
    }
}