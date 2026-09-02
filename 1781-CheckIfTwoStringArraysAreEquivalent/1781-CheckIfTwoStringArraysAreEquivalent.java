// Last updated: 02/09/2026, 09:40:40
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a=" ";
        String b=" ";
        for(int i=0;i<word1.length;i++){
            String s=word1[i];
            for(int j=0;j<s.length();j++){
            a+=s.charAt(j);
            }
        }
        for(int i=0;i<word2.length;i++){
            String k=word2[i];
            for(int j=0;j<k.length();j++){
            b+=k.charAt(j);
            }

        }
            
        if(!a.equals(b)){
            return false;
        }
        return true;
    }
}