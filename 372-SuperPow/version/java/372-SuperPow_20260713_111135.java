// Last updated: 13/07/2026, 11:11:35
1class Solution {
2    public int alternateDigitSum(int n) {
3
4        String t = String.valueOf(n);
5        int sum = 0;
6
7        for (int i = 0; i < t.length(); i++) {
8
9            int digit = t.charAt(i) - '0';
10
11            if (i % 2 == 0) {
12                sum += digit;   // + for even index
13            } else {
14                sum -= digit;   // - for odd index
15            }
16        }
17
18        return sum;
19    }
20}