class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int mx_sum = Integer.MIN_VALUE;
        for(int i:nums){
            sum += i;
            mx_sum = Math.max(sum,mx_sum);
            if(sum<0)sum =0;
        }
        return mx_sum;
    }
}