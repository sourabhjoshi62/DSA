class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[]arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = sum(i,nums);
        }
        return arr;
    }
    public int sum(int k,int[] nums){
        int n = nums.length;
        
        int ls = 0;
        int rs = 0;


         if(k==n-1){
            rs = 0;

            for(int i=0;i<k;i++){
            ls += nums[i];
            }
            int ans = Math.abs(ls - rs);
            return ans;
        }

        if(k==0){
            ls = 0;
            for(int i=k+1;i<n;i++){
            rs += nums[i];
            }
            int ans = Math.abs(ls-rs);
            return ans;
        }


        
        for(int i=0;i<k;i++){
            ls += nums[i];
        }
       
        for(int i=k+1;i<n;i++){
            rs += nums[i];
        }
        int ans = Math.abs(ls-rs);
        return ans;
        

    
    }
}