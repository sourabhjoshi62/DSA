class Solution {
    public int subarraySum(int[] nums, int k) {
        int[]prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j:prefix){
            if(map.containsKey(j-k)){
                cnt += map.get(j-k);
            }
            //map.getOrDefault(key, defaultValue)
            map.put(j,map.getOrDefault(j,0)+1);
        }
        return cnt;
        
    }
}