// Last updated: 09/07/2026, 09:10:14
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            int c=0;
            while(n>0){
                int rem=n%10;
                c++;
                n=n/10;

            }
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}