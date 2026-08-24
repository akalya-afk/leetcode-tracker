// Last updated: 24/08/2026, 09:19:31
1class Solution {
2    public int averageValue(int[] nums) {
3        int sum=0;
4        int count=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]%2==0 && nums[i]%3==0){
7                sum+=nums[i];
8                count++;
9                
10            }
11        }
12            if(count>0){
13                return sum/count;
14            }
15        
16        
17        return 0;
18    }
19}