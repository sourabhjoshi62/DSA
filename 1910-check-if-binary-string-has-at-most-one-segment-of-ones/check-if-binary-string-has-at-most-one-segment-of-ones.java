class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zeroFound = false;

        for(char ch : s.toCharArray()){
            if(ch == '0'){
                zeroFound = true;
            }
            if(zeroFound && ch == '1'){
                return false;
            }
        }

        return true;
    }
}