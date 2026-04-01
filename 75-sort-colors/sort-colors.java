class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int middle = 0;
        int end = nums.length-1;
        while(middle<=end){
            if(nums[middle]==0){
                int tmp = nums[middle];
                nums[middle] = nums[start];
                nums[start] = tmp;
                start++;
                middle++;
            }else if(nums[middle]==1){
                middle++;
            }else{
                int tmp = nums[middle];
                nums[middle] = nums[end];
                nums[end] = tmp;
                end--;
               

            }
        }
        
    }
}