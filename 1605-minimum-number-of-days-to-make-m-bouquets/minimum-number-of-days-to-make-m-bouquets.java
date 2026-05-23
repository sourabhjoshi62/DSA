class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(m*k)) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i:bloomDay){
            if(i<low){
               low = i;
            }
            if(i>high){
               high = i;
            }
        }
        int ans = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(check(bloomDay,m,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
        
        
    }
    public boolean check(int[] bloomDay, int m,int k,int day){
        int cnt = 0;
        int fl = 0;
        for(int i:bloomDay){
            if(i<=day){
                fl++;
                if(fl == k){
                    cnt++;
                    fl = 0;
                }
            }else{
                fl = 0;
            }
        }
            

        
        if(cnt>=m){
            return true;
        }else{
            return false;
        }


    }
}