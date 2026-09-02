// Last updated: 02/09/2026, 09:41:29
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int f=nums[n-1]*nums[n-2]*nums[n-3];
        int t=nums[0]*nums[1]*nums[n-1];

        int max=Math.max(f,t);
        return max;
        

    }
}