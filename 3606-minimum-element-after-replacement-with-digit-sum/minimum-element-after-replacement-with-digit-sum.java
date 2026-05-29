class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min = Math.min(min,sum(nums[i]));
        }
        return min;
        
    }
    public int sum(int k){
        int sum = 0;
        while(k>0){
            sum += k%10;
            k = k/10;
        }
        return sum;
    }
}