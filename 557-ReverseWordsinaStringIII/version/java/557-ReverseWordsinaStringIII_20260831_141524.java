// Last updated: 31/08/2026, 14:15:24
1class Solution {
2    public String reverseWords(String s) {
3        String ans="";
4        String arr[]=s.split(" ");
5        for(int j=0;j<arr.length;j++){
6            String str=arr[j];
7            for(int i=str.length()-1;i>=0;i--){
8                ans+=str.charAt(i);
9            }
10            if(j!=arr.length-1){
11                ans+=" ";
12            }
13     
14        }
15        return ans;
16    }
17}