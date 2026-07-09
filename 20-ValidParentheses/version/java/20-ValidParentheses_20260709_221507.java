// Last updated: 09/07/2026, 22:15:07
1class Solution {
2    public int findIntegers(int n) {
3
4        int[] dp = new int[32];
5
6        dp[0] = 1;
7        dp[1] = 2;
8
9        for (int i = 2; i < 32; i++) {
10            dp[i] = dp[i - 1] + dp[i - 2];
11        }
12
13        int ans = 0;
14        int prevBit = 0;
15
16        for (int i = 30; i >= 0; i--) {
17
18            if ((n & (1 << i)) != 0) {
19
20                ans += dp[i];
21
22                if (prevBit == 1)
23                    return ans;
24
25                prevBit = 1;
26            } else {
27                prevBit = 0;
28            }
29        }
30
31        return ans + 1;
32    }
33}