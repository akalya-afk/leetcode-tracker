// Last updated: 24/08/2026, 14:05:18
1class Solution {
2    public int countSegments(String s) {
3        s=s.trim();
4        if(s.length()==0){
5            return 0;
6        }
7       
8        return s.split("\\s+").length;
9    }
10}