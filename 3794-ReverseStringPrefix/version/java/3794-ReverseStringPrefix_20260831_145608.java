// Last updated: 31/08/2026, 14:56:08
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3     char c[]=s.toCharArray();
4     for(int i=0;i<c.length-1;i++){
5        int ans=Math.abs(c[i]-c[i+1]);
6        if(ans>2){
7            return false;
8            
9        }
10     }
11     return true;
12    }
13}