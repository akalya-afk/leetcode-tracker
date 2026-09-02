// Last updated: 02/09/2026, 09:41:55
class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
       
        return s.split("\\s+").length;
    }
}