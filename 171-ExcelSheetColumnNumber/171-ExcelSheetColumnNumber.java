// Last updated: 09/07/2026, 09:10:46
class Solution {
    public int titleToNumber(String columnTitle) {
        String s=columnTitle;
        int res=0;
        for(int i=0;i<s.length();i++){
            res=res*26+(s.charAt(i)-'A'+1);
        }
        return res;
    }
}