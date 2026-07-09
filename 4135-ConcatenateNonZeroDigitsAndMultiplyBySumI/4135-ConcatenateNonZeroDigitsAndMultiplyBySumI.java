// Last updated: 09/07/2026, 09:10:05
class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        int sum=0;
        if(n==0){
            return 0;
        }
        String s=String.valueOf(n);
        for(char c:s.toCharArray()){
            
            int d=c-'0';
            if(d!=0){
            x=x*10+d;
            sum+=d;
            }
        }
        return x*sum;
    }
}