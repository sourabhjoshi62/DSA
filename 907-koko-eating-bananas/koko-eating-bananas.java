class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low = 1;
        long high = piles[0];
        long ans = -1;
        for(long i:piles){
            if(i>high){
                high = i;
            }
        }
        while(low <= high){
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
    public boolean check(int[] piles,int h,long hours){
        long cnt = 0;
        for(long i:piles){
           if(i<=hours){
            cnt++;
           }else{
                long k = i/hours;
                long rem = i%hours;
                if(rem != 0){
                    cnt += k + 1;
                }else{
                    cnt += k;
                }
           }
        }
        if(cnt>h){
            return false;
        }else{
            return true;
        }

    }

}