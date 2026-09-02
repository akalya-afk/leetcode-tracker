// Last updated: 02/09/2026, 09:39:26
class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int temp=n;
        int sum=1;
            while(temp>0){
                   sum*=temp%10;
                   temp=temp/10;     
            }
            if(sum%t==0){
                return n;
            }
            n++;
        }
        
    }
}