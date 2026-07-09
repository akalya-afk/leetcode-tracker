// Last updated: 09/07/2026, 09:10:10
class Solution {
    public String truncateSentence(String s, int k) {
        String ans="";
        String[] arr=s.split(" ");
            for(int i=0;i<k;i++){
                ans+=arr[i];
                if(i!=k-1){
                  ans+=" ";
                }
            }
        return ans;
    }
}