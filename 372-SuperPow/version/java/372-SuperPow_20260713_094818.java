// Last updated: 13/07/2026, 09:48:18
1class Solution {
2
3    public String toHex(int num) {
4
5        if (num == 0)
6            return "0";
7
8        char[] hex = {
9            '0','1','2','3','4','5','6','7',
10            '8','9','a','b','c','d','e','f'
11        };
12
13        StringBuilder ans = new StringBuilder();
14
15        while (num != 0) {
16
17            ans.append(hex[num & 15]);
18
19            num >>>= 4;
20        }
21
22        return ans.reverse().toString();
23    }
24}