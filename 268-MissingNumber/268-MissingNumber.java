// Last updated: 09/07/2026, 09:10:25
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int act=0;
        int exp=n*(n+1)/2;
        for(int i=0;i<n;i++){
            act+=nums[i];
        }
        return exp-act;
    }
}