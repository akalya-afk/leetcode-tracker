// Last updated: 13/07/2026, 10:06:49
1class Solution {
2    public int countEven(int num) {
3        int count=0;
4        
5        for(int i=1;i<=num;i++){
6            int sum=0;
7            int temp=i;
8        while(temp>0){
9           
10            sum+=temp%10;
11            temp=temp/10;
12        }
13            if(sum%2==0){
14                count++;
15            }
16        }
17        
18        return count;
19    }
20}