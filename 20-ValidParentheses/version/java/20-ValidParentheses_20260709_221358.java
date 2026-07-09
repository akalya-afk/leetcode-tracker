// Last updated: 09/07/2026, 22:13:58
1class Solution {
2
3    public int findLUSlength(String a, String b) {
4
5        if (a.equals(b)) {
6            return -1;
7        }
8
9        return Math.max(a.length(), b.length());
10    }
11}