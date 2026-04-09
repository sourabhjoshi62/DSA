class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prev = new int[n];
        int pre = -1;
        int[] next = new int[n];
        int nex = -1;
        int water = 0;
        for(int i=0;i<n;i++){
             prev[i] = Math.max(pre,height[i]);
             pre = prev[i];
        }
        for(int i=n-1;i>=0;i--){
             next[i] = Math.max(nex,height[i]);
             nex = next[i];
        }
        for(int i=0;i<n;i++){
            water += Math.min(prev[i],next[i])-height[i];
        }
        return water;

        
    }
}