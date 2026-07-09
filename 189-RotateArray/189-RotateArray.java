// Last updated: 09/07/2026, 09:10:44
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int r=k%n;
        int temp[]=new int[n];
        int index=0;
        for(int i=n-r;i<n;i++){
            temp[index]=nums[i];
            index++;
            
        }
        for(int i=0;i<n-r;i++){
            temp[index]=nums[i];
            index++;
            
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
        
        
    }
}