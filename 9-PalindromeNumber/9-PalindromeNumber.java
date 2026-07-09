// Last updated: 09/07/2026, 09:11:20
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int ans=0;
        while(x>0){
            int rem=x%10;
            ans=ans*10+rem;
            x=x/10;
        }
    
        if(ans==temp){
            return true;
        }
        else{
            return false;
        }

        
    }
}