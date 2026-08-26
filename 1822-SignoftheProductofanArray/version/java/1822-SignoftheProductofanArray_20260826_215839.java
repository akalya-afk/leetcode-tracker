// Last updated: 26/08/2026, 21:58:39
1class Solution {
2    public int arraySign(int[] nums) {
3        int negative = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] == 0) {
7                return 0;
8            }
9
10            if (nums[i] < 0) {
11                negative++;
12            }
13        }
14
15        if (negative % 2 == 0) {
16            return 1;
17        } else {
18            return -1;
19        }
20    }
21}