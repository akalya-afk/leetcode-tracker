// Last updated: 09/07/2026, 09:11:07
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        String a=arr[arr.length-1];
        return a.length();
        
    }
}