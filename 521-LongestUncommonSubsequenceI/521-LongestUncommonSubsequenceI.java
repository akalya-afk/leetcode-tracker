// Last updated: 02/09/2026, 09:41:41
class Solution {

    public int findLUSlength(String a, String b) {

        if (a.equals(b)) {
            return -1;
        }

        return Math.max(a.length(), b.length());
    }
}