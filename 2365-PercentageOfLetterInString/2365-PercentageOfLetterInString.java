// Last updated: 02/09/2026, 09:40:06
class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==letter){
                count++;
            }
        }
        if(count>0){
            return count*100/n;
            
        }
        return 0;
    }
}