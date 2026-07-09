// Last updated: 09/07/2026, 09:10:15
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String ans=s+s;
        if(ans.contains(goal)){
            return true;
        }
        else{
            return false;
        }
    }
}