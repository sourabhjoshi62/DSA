class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word:str){
            StringBuilder st = new StringBuilder(word);
            result.append(st.reverse()).append(" ");
        }
        return result.toString().trim();
        
    }
}