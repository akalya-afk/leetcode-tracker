// Last updated: 09/07/2026, 22:11:43
1class Solution {
2
3    public String addStrings(String num1, String num2) {
4
5        StringBuilder ans = new StringBuilder();
6
7        int i = num1.length() - 1;
8        int j = num2.length() - 1;
9        int carry = 0;
10
11        while (i >= 0 || j >= 0 || carry != 0) {
12
13            int digit1 = 0;
14            int digit2 = 0;
15
16            if (i >= 0) {
17                digit1 = num1.charAt(i) - '0';
18                i--;
19            }
20
21            if (j >= 0) {
22                digit2 = num2.charAt(j) - '0';
23                j--;
24            }
25
26            int sum = digit1 + digit2 + carry;
27
28            ans.append(sum % 10);
29            carry = sum / 10;
30        }
31
32        return ans.reverse().toString();
33    }
34}