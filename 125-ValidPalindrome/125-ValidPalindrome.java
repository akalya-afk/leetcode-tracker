// Last updated: 09/07/2026, 09:10:55
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String rev=new StringBuilder(s).reverse().toString();
        if(rev.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}