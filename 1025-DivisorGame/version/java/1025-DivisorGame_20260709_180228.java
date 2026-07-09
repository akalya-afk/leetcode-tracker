// Last updated: 09/07/2026, 18:02:28
1import java.util.Arrays;
2
3class Solution {
4    public int thirdMax(int[] nums) {
5
6        Arrays.sort(nums);
7
8        int count = 1;
9        int max = nums[nums.length - 1];
10
11        for (int i = nums.length - 2; i >= 0; i--) {
12
13            if (nums[i] != nums[i + 1]) {
14                count++;
15
16                if (count == 3) {
17                    return nums[i];
18                }
19            }
20        }
21
22        return max;
23    }
24}