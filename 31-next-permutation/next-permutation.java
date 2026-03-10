class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int r = n-2;
        while(r>=0){
            if(nums[r] >= nums[r+1]){
                r--;
                if(r<0){
                    Arrays.sort(nums);
                    return;
                 }
            }else{
                 
                 
                 int small = r+1;
                 for(int i=r+1;i<n;i++){
                    if(nums[i]>nums[r] && nums[i]<nums[small]){
                        small = i;
                    }
                 }
                 int tmp = nums[r];
                 nums[r] = nums[small];
                 nums[small] = tmp;
                
                Arrays.sort(nums,r+1,n);
                break;
            }
        }
        
    }
}