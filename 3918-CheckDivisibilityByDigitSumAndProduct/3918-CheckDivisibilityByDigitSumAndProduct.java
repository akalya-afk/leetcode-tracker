// Last updated: 02/09/2026, 09:39:20
class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n=n/10;
        }
        int total=sum+prod;
        
        if(temp%total==0){
            return true;

        }
        return false;
    }
}