class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        int n = nums.length;
        for(int i:nums){
            sum += i;
        }
        int k = sum-x;
         if(k < 0) return -1;
        if(k == 0) return n;

        int s = 0;
        int max = -1;
        int l = 0;
        for(int i=0;i<n;i++){
           s += nums[i];
           
           if(s>k){
           while(s > k){
              
              s -=nums[l];
              l++;
             }
           }
           if(s == k){
            max = Math.max(max,i-l+1);
           }
        }
         return max == -1 ? -1 : n - max;
        
    }
    
}