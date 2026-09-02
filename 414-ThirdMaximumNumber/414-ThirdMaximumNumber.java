// Last updated: 02/09/2026, 09:42:02
import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int count = 1;
        int max = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1]) {
                count++;

                if (count == 3) {
                    return nums[i];
                }
            }
        }

        return max;
    }
}