// Last updated: 02/09/2026, 09:41:38
class Solution {
    public String reverseWords(String s) {
        String ans="";
        String arr[]=s.split(" ");
        for(int j=0;j<arr.length;j++){
            String str=arr[j];
            for(int i=str.length()-1;i>=0;i--){
                ans+=str.charAt(i);
            }
            if(j!=arr.length-1){
                ans+=" ";
            }
     
        }
        return ans;
    }
}