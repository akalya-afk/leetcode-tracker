// Last updated: 02/09/2026, 09:40:50
class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max2=num;
            }

        }
        return (max1-1)*(max2-1);
    }
}