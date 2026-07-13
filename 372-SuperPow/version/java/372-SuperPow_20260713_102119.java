// Last updated: 13/07/2026, 10:21:19
1class Solution {
2    public int numberOfCuts(int n) {
3        if(n==1){
4            return 0;
5        }
6        if(n%2==0){
7            return n/2;
8        }
9        return n;
10    }
11}