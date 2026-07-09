// Last updated: 09/07/2026, 17:57:38
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3
4        int count = 0;
5        int max = 0;
6
7        for (int num : nums) {
8            if (num == 1) {
9                count++;
10                max = Math.max(max, count);
11            } else {
12                count = 0;
13            }
14        }
15
16        return max;
17    }
18}