// Last updated: 09/07/2026, 09:10:09
class Solution {
    public String capitalizeTitle(String title) {
        String s=title.toLowerCase();
        String[] arr=s.trim().split("\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String ans=arr[i];
            if(ans.length()>2){
            sb.append(Character.toUpperCase(ans.charAt(0))+ans.substring(1));
            }
            else{
                sb.append(ans);
            }
            if(i<arr.length-1)
            sb.append(" ");
        }
    
            
        return sb.toString();
    }
}