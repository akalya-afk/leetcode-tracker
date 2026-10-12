// Last updated: 12/10/2026, 15:37:16
1class Solution {
2    public int findNumbers(int[] nums) {
3        int count=0;
4        for(int n:nums){
5            int c=0;
6            while(n>0){
7                int rem=n%10;
8                c++;
9                n=n/10;
10
11            }
12            if(c%2==0){
13                count++;
14            }
15        }
16        return count;
17    }
18}