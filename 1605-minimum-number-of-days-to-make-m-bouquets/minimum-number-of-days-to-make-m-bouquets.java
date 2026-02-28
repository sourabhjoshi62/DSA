class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = -1;
        if((long)m * k > bloomDay.length) return -1;
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
            int mid = low + (high-low)/2;
            if(check(bloomDay,m,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] bloomDay, int m, int k,int days){
        int cnt = 0;
        int flowers = 0;
        for(int i:bloomDay){
            if(i<=days){
                flowers++;
                if(flowers == k){
                   cnt++;
                    flowers = 0;
                }
            }else{
                flowers = 0;
            }
        }
        if(cnt>=m){
            return true;
        }else{
            return false;
        }

    }
}