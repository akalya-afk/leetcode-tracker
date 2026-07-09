// Last updated: 09/07/2026, 22:13:06
1class Solution {
2    public int fib(int n) {
3
4        if (n == 0)
5            return 0;
6
7        if (n == 1)
8            return 1;
9
10        int a = 0;
11        int b = 1;
12
13        for (int i = 2; i <= n; i++) {
14            int c = a + b;
15            a = b;
16            b = c;
17        }
18
19        return b;
20    }
21}