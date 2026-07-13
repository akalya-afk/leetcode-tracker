// Last updated: 13/07/2026, 12:39:31
1class Solution {
2    public boolean isPowerOfThree(int n) {
3
4        if (n <= 0) {
5            return false;
6        }
7
8        while (n % 3 == 0) {
9            n = n / 3;
10        }
11
12        return n == 1;
13    }
14}