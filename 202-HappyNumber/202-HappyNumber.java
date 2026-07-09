// Last updated: 09/07/2026, 09:10:39
class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7)return true;
        else if(n<10)return false;
        else{
        int sum=0;
        int temp=n;
        while(temp!=0){
        int res=temp%10;
        
        sum+=Math.pow(res,2);
        temp/=10;
        }
        return isHappy(sum);
        }
    }
    
}