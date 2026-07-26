class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans1 = 1;
        for(int i=n-1;i>n-4;i--){
            ans1 *= nums[i];
        }

        int ans2 = nums[0]*nums[1]*nums[n-1];
        return Math.max(ans1,ans2);
        
    }
}