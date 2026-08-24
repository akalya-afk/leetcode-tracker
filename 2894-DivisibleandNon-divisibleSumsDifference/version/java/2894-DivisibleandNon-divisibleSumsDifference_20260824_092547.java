// Last updated: 24/08/2026, 09:25:47
1class Solution {
2    public int differenceOfSums(int n, int m) {
3        int sum1=0;
4        int sum2=0;
5        for(int i=1;i<=n;i++){
6                if(i%m==0){
7                    sum1+=i;
8                }
9                else{
10                    sum2+=i;
11                }
12        }
13        return sum2-sum1;
14    }
15}