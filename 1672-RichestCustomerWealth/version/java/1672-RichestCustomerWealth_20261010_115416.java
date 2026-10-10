// Last updated: 10/10/2026, 11:54:16
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int col=accounts[0].length;
4        int row=accounts.length;
5        int max=0;
6        for(int i=0;i<accounts.length;i++){
7            int sum=0;
8            for(int j=0;j<accounts[0].length;j++){
9                    sum+=accounts[i][j];
10            }
11            if(sum>max){
12                max=sum;
13            }
14        }
15        return max;
16    }
17}