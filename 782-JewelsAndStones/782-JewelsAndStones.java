// Last updated: 09/07/2026, 09:10:17
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
    
        String v=stones;
        int count=0;
            for(int j=0;j<v.length();j++){
                if(jewels.indexOf(v.charAt(j))!=-1){
                    count++;
                    
                }
            }
        
        return count;
    }
}