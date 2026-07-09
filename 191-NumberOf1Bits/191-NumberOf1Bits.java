// Last updated: 09/07/2026, 09:10:41
class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int rem=n%2;
            sb.append(rem);
            n=n/2;
        }
       // String rev=sb.reverse().toString();
        int count1=0;
      //  int count0=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                count1++;
            }
        }
        return count1;
    }
}