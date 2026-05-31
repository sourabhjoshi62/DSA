class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long k = mass;
        for(long i:asteroids){
            if(i<=k){
                k +=i;
            }else{
                return false;
            }
        }
        return true;
    }
}