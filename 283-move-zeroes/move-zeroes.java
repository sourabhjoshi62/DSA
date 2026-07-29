class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 1;
        int n = nums.length;
        while(r<n){
            if(nums[l]==0 && nums[r]==0){
                r++;
            }else if(nums[l] != 0 && nums[r]==0){
                r++;
                l++;
            }else if(nums[l]==0 && nums[r]!=0){
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                r++;
                l++;
            }else{
                l++;
                r++;
            }
        }
        
    }
}