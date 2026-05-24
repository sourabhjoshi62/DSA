class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int n = position.length;
        int high = position[n-1]-position[0];
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(check(position,m,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
        
    }
    public boolean check(int[] position, int m,int dist){
        int balls = 1;
        int last = position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-last >= dist){
                balls++;
                last = position[i];
            }
            if(balls==m)return true;
        }
        

        return false;

    }
}