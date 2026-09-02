// Last updated: 02/09/2026, 09:39:05
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
     char c[]=s.toCharArray();
     for(int i=0;i<c.length-1;i++){
        int ans=Math.abs(c[i]-c[i+1]);
        if(ans>2){
            return false;
            
        }
     }
     return true;
    }
}