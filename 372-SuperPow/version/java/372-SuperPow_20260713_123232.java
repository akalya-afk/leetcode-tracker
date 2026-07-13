// Last updated: 13/07/2026, 12:32:32
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(true){
4        int temp=n;
5        int sum=1;
6            while(temp>0){
7                   sum*=temp%10;
8                   temp=temp/10;     
9            }
10            if(sum%t==0){
11                return n;
12            }
13            n++;
14        }
15        
16    }
17}