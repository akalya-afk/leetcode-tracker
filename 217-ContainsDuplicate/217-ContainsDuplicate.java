// Last updated: 09/07/2026, 09:10:36
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }
            if(set.size()!=nums.length){
                return true;
            }
            else{
                return false;
            }
        }
    }
