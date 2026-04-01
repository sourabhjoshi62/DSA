class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int size = 0;
        HashSet<Character>set = new HashSet<>();
        while(r<n){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                size = Math.max(size,r-l+1);
                r++;
            }else{
                
                    while(set.contains(s.charAt(r))){
                        set.remove(s.charAt(l));
                        l++;
                    }

                

            }
        }
        return size;
        
    }
}