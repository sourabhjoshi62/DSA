class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max_cnt = 0;
       
        int r = 0;
        int n = nums.length;
        while(r<n){
            if(nums[r]==1){
              cnt++;
              max_cnt = Math.max(cnt,max_cnt);
             
            }
            else{
                max_cnt = Math.max(cnt,max_cnt);
                cnt = 0;
         
            }
             r++;

        }
        return max_cnt;
        
    }
}