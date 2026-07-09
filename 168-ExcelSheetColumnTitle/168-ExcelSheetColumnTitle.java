// Last updated: 09/07/2026, 09:10:50
class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        StringBuilder sb=new StringBuilder();
        while(n>0){
            n--;
            sb.append((char)('A'+n%26));
            n=n/26;
        }
        return sb.reverse().toString();

    }
}