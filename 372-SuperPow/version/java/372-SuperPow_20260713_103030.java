// Last updated: 13/07/2026, 10:30:30
1class Solution {
2    public int countDigits(int num) {
3        int temp=num;
4        int count=0;
5        while(num>0){
6            int r=num%10;
7            if(temp%r==0){
8                count++;
9            }
10            num=num/10;
11        }
12        return count;
13    }
14}