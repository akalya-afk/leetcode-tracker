// Last updated: 09/07/2026, 22:04:49
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int max = nums[0];
5        int min = nums[0];
6        int ans = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9
10            // If current number is negative, swap max and min
11            if (nums[i] < 0) {
12                int temp = max;
13                max = min;
14                min = temp;
15            }
16
17            max = Math.max(nums[i], max * nums[i]);
18            min = Math.min(nums[i], min * nums[i]);
19
20            ans = Math.max(ans, max);
21        }
22
23        return ans;
24    }
25}