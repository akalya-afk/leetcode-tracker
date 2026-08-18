// Last updated: 18/08/2026, 11:49:56
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3
4        // Step 1: Remove all '-'
5        s = s.replace("-", "");
6
7        // Step 2: Convert everything to uppercase
8        s = s.toUpperCase();
9
10        // Step 3: Build the answer
11        String ans = "";
12
13        int count = 0;
14
15        // Start from the last character
16        for (int i = s.length() - 1; i >= 0; i--) {
17
18            ans = s.charAt(i) + ans;
19
20            count++;
21
22            // Put '-' after k characters
23            if (count%k == 0 && i != 0) {
24                ans = "-" + ans;
25               // count = 0;
26            }
27        }
28
29        return ans;
30    }
31}