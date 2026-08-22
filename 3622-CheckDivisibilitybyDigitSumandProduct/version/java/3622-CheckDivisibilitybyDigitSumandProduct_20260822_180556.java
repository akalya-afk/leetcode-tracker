// Last updated: 22/08/2026, 18:05:56
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int temp=n;
4        int sum=0;
5        int prod=1;
6        while(n>0){
7            int rem=n%10;
8            sum+=rem;
9            prod*=rem;
10            n=n/10;
11        }
12        int total=sum+prod;
13        
14        if(temp%total==0){
15            return true;
16
17        }
18        return false;
19    }
20}