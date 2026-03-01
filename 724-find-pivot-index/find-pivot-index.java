class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int[] ps = new int[n];
        ps[0] = nums[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1] + nums[i];
        }
        int ans = -1;
        int left = 0;
        int right = 0;
        for(int i =0;i<n;i++){

            if(i==0){
                left = 0;
            }else{
                left = ps[i-1];
            }

            if(i==n-1){
                right = 0;
            }else{
                right = ps[n-1] - ps[i];
            }

            if(left==right){
                return i;

            }

            
        }
        return -1;
        
    }
}