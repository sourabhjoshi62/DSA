class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i=0;i<n;i++){
            if(isTrue(words[i])){
                return words[i];
            }
        }
        return "";
        
    }
    public boolean isTrue(String s){
        int n= s.length();
        int l = 0;
        int r = n-1;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}