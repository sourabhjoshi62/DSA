class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        if(n==2){
          return cost[0]+cost[1];
        }
        if(n==1){
            return cost[0];
        }
        // int i = n-1;
        // int j = n-2;
        // int k = n-3;
        int sum = 0;


        // while(j>=0 || k>=0 || i>=0){
        //     sum += cost[i]+cost[j];
        //     i = k-1;
        //     j = i-1;
        //     k = j-1;
        // }
        // return sum;
        
        for(int i=n-1;i>=0;i=i-3){
            if(i==0){
                sum += cost[i];
            }else{
                sum += cost[i]+cost[i-1];
            }

        }
        return sum;


        
    }
}