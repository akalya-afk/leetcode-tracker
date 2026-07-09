// Last updated: 09/07/2026, 18:12:55
1class Solution {
2    public int myAtoi(String s) {
3
4        s = s.trim();          // Remove leading and trailing spaces
5
6        if (s.length() == 0)
7            return 0;
8
9        int sign = 1;
10        int i = 0;
11        long num = 0;
12
13        // Check sign
14        if (s.charAt(0) == '-') {
15            sign = -1;
16            i++;
17        } else if (s.charAt(0) == '+') {
18            i++;
19        }
20
21        // Read digits
22        while (i < s.length() && Character.isDigit(s.charAt(i))) {
23
24            num = num * 10 + (s.charAt(i) - '0');
25
26            // Overflow check
27            if (sign * num > Integer.MAX_VALUE)
28                return Integer.MAX_VALUE;
29
30            if (sign * num < Integer.MIN_VALUE)
31                return Integer.MIN_VALUE;
32
33            i++;
34        }
35
36        return (int) (sign * num);
37    }
38}