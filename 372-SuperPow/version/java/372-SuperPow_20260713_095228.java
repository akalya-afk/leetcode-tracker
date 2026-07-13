// Last updated: 13/07/2026, 09:52:28
1import java.util.Arrays;
2
3class Solution {
4
5    public int largestPerimeter(int[] nums) {
6
7        Arrays.sort(nums);
8
9        for (int i = nums.length - 1; i >= 2; i--) {
10
11            if (nums[i - 2] + nums[i - 1] > nums[i]) {
12
13                return nums[i - 2] + nums[i - 1] + nums[i];
14            }
15        }
16
17        return 0;
18    }
19}