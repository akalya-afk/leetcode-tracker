// Last updated: 16/07/2026, 12:36:23
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        if (dividend == Integer.MIN_VALUE && divisor == -1) {
5            return Integer.MAX_VALUE;
6        }
7
8        return dividend / divisor;
9    }
10}