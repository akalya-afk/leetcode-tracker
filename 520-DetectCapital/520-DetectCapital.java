// Last updated: 09/07/2026, 09:10:18
class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        char ch[]=word.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                c++;
            }
        }
        if(c==0){
        return true;
        }
        if(c==1 && ch[0]>=65 && ch[0]<=90){
            return true;
        }
        if(c==ch.length){
            return true;
        }
        return false;
        
    }
}