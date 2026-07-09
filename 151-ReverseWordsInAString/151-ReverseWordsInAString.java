// Last updated: 09/07/2026, 09:10:51
class Solution {
    public String reverseWords(String s) {
      String[] str=s.trim().split("\\s+");
      StringBuilder op=new StringBuilder();
      for(int i=str.length-1;i>=0;i--){
        op.append(str[i]);
      
      if(i!=0){
        op.append(" ");
      }
      } 
      return op.toString();
    }
}