// Last updated: 09/07/2026, 22:06:13
1public class Solution {
2
3    public int reverseBits(int n) {
4
5        int result = 0;
6
7        for (int i = 0; i < 32; i++) {
8
9            result = result << 1;   // Make space for next bit
10            result = result | (n & 1); // Copy last bit of n
11
12            n = n >>> 1; // Unsigned right shift
13        }
14
15        return result;
16    }
17}