class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low = 1;
        long high = 0;
        long n = piles.length;
      
        for(int i:piles){
            high = Math.max(i,high);
        }
        long ans = 0;
        while(low<=high){
            long mid = low + (high-low)/2;
            if(check(piles,h,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return (int)ans;

        
    }
    public boolean check(int[] piles, int h, long hour){
        long cnt = 0;
        for(int i:piles){
           cnt += (i + hour -1)/hour;

        }
        if(cnt<=h){
            return true;
            }
        else 
        return false;
    }
}