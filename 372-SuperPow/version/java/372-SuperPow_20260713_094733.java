// Last updated: 13/07/2026, 09:47:33
1class Solution {
2
3    int MOD = 1337;
4
5    public int superPow(int a, int[] b) {
6
7        int result = 1;
8
9        for (int digit : b) {
10            result = pow(result, 10) * pow(a, digit) % MOD;
11        }
12
13        return result;
14    }
15
16    public int pow(int a, int b) {
17
18        a %= MOD;
19        int result = 1;
20
21        for (int i = 0; i < b; i++) {
22            result = (result * a) % MOD;
23        }
24
25        return result;
26    }
27}