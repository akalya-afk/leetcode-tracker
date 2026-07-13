// Last updated: 13/07/2026, 10:11:01
1class Solution {
2    public int commonFactors(int a, int b) {
3        int c=0;
4        int min=Math.min(a,b);
5        for(int i=1;i<=min;i++){
6            if(a%i==0 && b%i==0){
7                c++;
8            }
9        }
10        return c;
11    }
12}