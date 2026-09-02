// Last updated: 02/09/2026, 09:40:19
class Solution {
    
    public String firstPalindrome(String[] words) {
        for(int j=0;j<words.length;j++){
            String word=words[j];
            String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev+=word.charAt(i);
        }
        if(rev.equals(word)){
            return rev;
        }
    }
        return "";
    }
}