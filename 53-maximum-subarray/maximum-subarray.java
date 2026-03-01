class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
       
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i:nums){
            sum += i;
           
            max_sum = Math.max(sum,max_sum);

             if(sum<0){
                sum = 0;
            }
        }
        return max_sum;
        
    }
}