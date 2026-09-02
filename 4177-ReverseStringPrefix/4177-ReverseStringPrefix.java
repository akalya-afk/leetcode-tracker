// Last updated: 02/09/2026, 09:39:08
class Solution {
    public String reversePrefix(String s, int k) {
        String ans="";
        for(int i=k-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        for(int i=k;i<=s.length()-1;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
}